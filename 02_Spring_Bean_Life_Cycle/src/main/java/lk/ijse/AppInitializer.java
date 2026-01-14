package lk.ijse;

import bean.MyConnection;
import bean.SpringBean;
import config.AppConfig;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class AppInitializer {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext();
        context.register(AppConfig.class);
        context.refresh();
        context.register(SpringBean.class);
        context.getBean(SpringBean.class);

        context.registerShutdownHook();
    }
}