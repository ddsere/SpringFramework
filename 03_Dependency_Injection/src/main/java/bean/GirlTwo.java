package bean;

import org.springframework.stereotype.Component;

@Component
public class GirlTwo implements Agreement{
    public GirlTwo() {
        System.out.println("GirlTwo  : Object Creation");
    }

    @Override
    public void chat() {
        System.out.println("GirlTwo : Chat");
    }
}
