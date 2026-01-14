package lk.ijse.bean;

import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;

@Component
public class SpringBeanThree {
    /*//FullMode
    @Bean
    public SpringBeanOne springBeanOne() {
        //Inter-bean dependency = not satisfied
        //invoking bean method inside another bean method
        SpringBeanTwo springBeanTwo1 = new SpringBeanTwo();
        SpringBeanTwo springBeanTwo2 = new SpringBeanTwo();
        System.out.println(springBeanTwo1);
        System.out.println(springBeanTwo2);
        return new SpringBeanOne();

    }

    @Bean
    public SpringBeanTwo springBeanTwo() {
        return new SpringBeanTwo();
    }*/
}
