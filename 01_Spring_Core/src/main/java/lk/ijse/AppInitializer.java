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

        SpringBean bean1 = (SpringBean) context.getBean("springBean");
        SpringBean bean2 = (SpringBean) context.getBean("springBean");

        bean1.printMessage();
        bean2.printMessage();

        System.out.println(bean1);
        System.out.println(bean2);


        MyConnection con1 = context.getBean(MyConnection.class);
        MyConnection con2 = context.getBean(MyConnection.class);

        System.out.println(con1);
        System.out.println(con2);

        context.registerShutdownHook();
    }
}