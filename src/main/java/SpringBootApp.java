import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

/*@SpringBootApplication
@ComponentScan(basePackages = "{API}")*/
/*@Configuration
@EnableAutoConfiguration*/
@SpringBootApplication
@ComponentScan(basePackages = {"Model","Service","API"})
public class SpringBootApp{

    public static void main(String[] args) {
        SpringApplication.run(SpringBootApp.class, args);
    }
}
