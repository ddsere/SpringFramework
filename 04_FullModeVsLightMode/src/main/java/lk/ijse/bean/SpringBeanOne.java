package lk.ijse.bean;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.*;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.stereotype.Component;

public class SpringBeanOne implements BeanNameAware, BeanFactoryAware, InitializingBean, DisposableBean, ApplicationContextAware {

    public SpringBeanOne() {
        System.out.println("SpringBeanOne : Constructor");
    }

    @Override
    public void setBeanFactory(BeanFactory beanFactory) throws BeansException {
        System.out.println("SpringBeanOne: BeanFactoryAware");
    }

    @Override
    public void setBeanName(String name) {
        System.out.println("SpringBeanOne: BeanNameAware");
    }

    @Override
    public void destroy() throws Exception {
        System.out.println("SpringBeanOne: DisposableBean");
    }

    @Override
    public void afterPropertiesSet() throws Exception {
        System.out.println("SpringBeanOne: InitializingBean");
    }

    @Override
    public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
        System.out.println("SpringBeanOne: ApplicationContextAware");
    }
}
