package bean;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class Boy {
    public Boy(){
        System.out.println("Boy : Object Creation");
    }

    @Qualifier("girlTwo")
    @Autowired
    Agreement agreement;

    public void chatWithGirl() {
        agreement.chat();
    }
}
