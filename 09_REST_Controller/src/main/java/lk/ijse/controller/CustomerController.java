package lk.ijse.controller;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("api/v1/customer")
public class CustomerController {
    @PostMapping()
    public String saveCustomer(@RequestParam("name") String name, @RequestParam("id") String id, @RequestParam("address") String address){
        return "saved "+ name + " " + id + " " + address;
    }

    @GetMapping("search")
    public String searchCustomer(@RequestParam("id")String id){
        return "searching for customer " + id;
    }

    @DeleteMapping("{cid}")
    public String deleteCustomer(@PathVariable("cid")String cid){
        return "deleted " + cid;
    }
}
