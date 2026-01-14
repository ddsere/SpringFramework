package lk.ijse;

import Test.TestOne;
import bean.Boy;
import bean.GirlOne;
import config.AppConfig;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class AppInitializer {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext("bean","config");

        TestOne testOne = context.getBean(TestOne.class);
        testOne.chatWithTestTwo();

        context.registerShutdownHook();
    }
}