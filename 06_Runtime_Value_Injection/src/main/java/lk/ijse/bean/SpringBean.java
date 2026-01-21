package lk.ijse.bean;

import org.springframework.beans.factory.InitializingBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class SpringBean {
    @Autowired(required = false)
    public SpringBean(@Value("1234v")String nic[]) {
        System.out.println(nic[0]);
    }

    @Autowired(required = false)
    public SpringBean(@Value("sere")String name, @Value("24")String age) {
        System.out.println("SpringBean Object Created");
        System.out.println(name);
        System.out.println(age);
    }
}
