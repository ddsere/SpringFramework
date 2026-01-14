package bean;

import org.springframework.stereotype.Component;

@Component
public class SpringBean {
    public SpringBean() {
        System.out.println("SpringBean Object Created!");
    }

    public void printMessage() {
        System.out.println("SpringBean printMessage");
    }
}
