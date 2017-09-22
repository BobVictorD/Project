package Application;

import Application.API.StatusApi;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

/*@SpringBootApplication
@ComponentScan(basePackages = "{Application.API}")*/
/*@Configuration
@EnableAutoConfiguration*/
@SpringBootApplication
public class SpringBootApp{

    public static void main(String[] args) {
        SpringApplication.run(SpringBootApp.class, args);
    }
}
