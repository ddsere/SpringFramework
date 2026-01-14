package bean;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.*;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;

public class MyConnection implements BeanNameAware, BeanFactoryAware, ApplicationContextAware, InitializingBean, DisposableBean {
    public MyConnection() {
        System.out.println("Step *1: Instantiation");
    }

    @Override
    public void setBeanFactory(BeanFactory beanFactory) throws BeansException {
        System.out.println("Step *4 : BeanFactoryAware");
    }

    @Override
    public void setBeanName(String name) {
        System.out.println("Step *3: BeanNameAware");
    }

    @Override
    public void destroy() throws Exception {
        System.out.println("Step *7: DisposableBean");
    }

    @Override
    public void afterPropertiesSet() throws Exception {
        System.out.println("Step *6: InitializingBean");
    }

    @Override
    public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
        System.out.println("Step *5: ApplicationContextAware");
    }
}
