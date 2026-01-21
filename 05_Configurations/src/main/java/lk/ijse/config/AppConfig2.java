package lk.ijse.config;

import lk.ijse.bean.C;
import lk.ijse.bean.D;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages = "lk.ijse.bean")
public class AppConfig2 {
    public AppConfig2() {
        System.out.println("AppConfig2 constructor");
    }

    @Bean
    public C c(){
        return new C();
    }

    @Bean
    public D d(){
        return new D();
    }
}
