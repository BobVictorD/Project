package Application.Security;

import Application.Service.AuthService;
import io.jsonwebtoken.Claims;
import io.jsonwebtoken.Jwts;
import io.jsonwebtoken.SignatureException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.filter.GenericFilterBean;

import javax.servlet.FilterChain;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@Service
public class JwtFilter extends GenericFilterBean {

    @Autowired
    protected AuthService serv;

    public void doFilter(final ServletRequest req, final ServletResponse res, final FilterChain chain)
            throws IOException, ServletException {

        final HttpServletRequest request = (HttpServletRequest) req;
        final HttpServletResponse response = (HttpServletResponse) res;
        final String authHeader = request.getHeader("authorization");

        //Code rajouté a la derniére minute
        //lors des derniers test de verification (par acquis de conscience) la methode
        //censé faire le travail (voir SpringBootApp) ne le fait pu
        //aprés recherche je ne trouve pas de solutions et fini donc par mettre en place
        //ce code pas trés propre.
        if(((HttpServletRequest) req).getServletPath().matches("/auth/login")){
            chain.doFilter(req, res);
        }
        if(((HttpServletRequest) req).getServletPath().matches("/auth/register")){
            chain.doFilter(req, res);
        }

        if ("OPTIONS".equals(request.getMethod())) {
            response.setStatus(HttpServletResponse.SC_OK);

            chain.doFilter(req, res);
        } else {

            if (authHeader == null || !authHeader.startsWith("Bearer ")) {
                throw new ServletException("Missing or invalid Authorization header");
            }

            final String token = authHeader.substring(7);

            try {
                final Claims claims = Jwts.parser().setSigningKey("secretkey").parseClaimsJws(token).getBody();
                String user = claims.getSubject();
                if (!serv.exist(user)){
                    throw new SecurityException();
                }
                request.setAttribute("claims", claims);
            } catch (final SignatureException e) {
                throw new ServletException("Invalid token");
            }catch (final SecurityException e) {
                throw new ServletException("Invalid token");
            }

            chain.doFilter(req, res);
        }
    }
}