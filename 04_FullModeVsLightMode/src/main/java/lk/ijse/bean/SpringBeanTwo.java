package lk.ijse.bean;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.*;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.stereotype.Component;

public class SpringBeanTwo implements BeanNameAware, BeanFactoryAware, InitializingBean, DisposableBean, ApplicationContextAware {

    public SpringBeanTwo() {
        System.out.println("SpringBeanTwo: Constructor");
    }

    @Override
    public void setBeanFactory(BeanFactory beanFactory) throws BeansException {
        System.out.println("SpringBeanTwo: BeanFactoryAware");
    }

    @Override
    public void setBeanName(String name) {
        System.out.println("SpringBeanTwo: BeanNameAware");
    }

    @Override
    public void destroy() throws Exception {
        System.out.println("SpringBeanTwo: DisposableBean");
    }

    @Override
    public void afterPropertiesSet() throws Exception {
        System.out.println("SpringBeanTwo: InitializingBean");
    }

    @Override
    public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
        System.out.println("SpringBeanTwo: ApplicationContextAware");
    }
}
