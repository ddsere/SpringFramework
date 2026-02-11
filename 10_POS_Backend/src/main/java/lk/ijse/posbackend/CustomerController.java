package lk.ijse.posbackend;

import lk.ijse.posbackend.service.CustomerServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("api/v1/customer")
public class CustomerController {
    @Autowired
    private CustomerServiceImpl customerServiceImpl;

    @GetMapping
    public String Hello(){
        return "Hello World";
    }

    @PostMapping(consumes = "application/json")
    public String SaveCustomer(@RequestBody CustomerDto customerDto) {
        return "customer Saved" + customerDto.getCid();
    }
}
