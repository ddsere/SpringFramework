package bean;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.*;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.stereotype.Component;

@Component
public class GirlOne implements Agreement, BeanNameAware, BeanFactoryAware, InitializingBean, DisposableBean, ApplicationContextAware {
    public GirlOne(){
        System.out.println("GirlOne : Object Creation");
    }

    @Override
    public void setBeanFactory(BeanFactory beanFactory) throws BeansException {
        System.out.println("Step 4: BeanFactoryAware");
    }

    @Override
    public void setBeanName(String name) {
        System.out.println("Step 3: BeanNameAware");
    }

    @Override
    public void destroy() throws Exception {
        System.out.println("Step 7: DisposableBean");
    }

    @Override
    public void afterPropertiesSet() throws Exception {
        System.out.println("Step 6: InitializingBean");
    }

    @Override
    public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
        System.out.println("Step 5: ApplicationContextAware");
    }

    @Override
    public void chat() {
        System.out.println("GirlOne : Chat");
    }
}
