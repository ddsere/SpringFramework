package config;

import bean.MyConnection;
import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

@Configuration
@ComponentScan(basePackages = {"bean","demo"})
public class AppConfig {
    @Bean
    @Scope("prototype")
    /*@Scope(ConfigurableBeanFactory.SCOPE_PROTOTYPE)*/
    MyConnection myConnection(){
        return new MyConnection();
    }
}
