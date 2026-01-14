package Test;

import bean.Agreement;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class TestOne implements DI {

    //PROPERTY INJECTION
    /*@Autowired
    TestAgreement testAgreement;

    public void chatWithTestTwo(){
        testAgreement.chat();
    }*/

    //CONSTRUCTOR THROUGH INJECTION
    /*TestAgreement testAgreement;

    @Autowired
    public TestOne(TestAgreement testAgreement) {
        this.testAgreement = testAgreement;
    }

    public void chatWithTestTwo(){
        testAgreement.chat();
    }*/

    //SETTER METHOD THROUGH INJECTION
    /*TestAgreement testAgreement;

    @Autowired
    public void setter(TestAgreement testAgreement) {
        this.testAgreement = testAgreement;
    }

    public void chatWithTestTwo(){
        testAgreement.chat();
    }*/

    //INTERFACE THROUGH INJECTION
    TestAgreement testAgreement;


    @Autowired
    @Override
    public void Inject(TestAgreement testAgreement) {
        this.testAgreement = testAgreement;
    }

    public void chatWithTestTwo(){
        testAgreement.chat();
    }
}
