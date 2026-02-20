package lk.ijse.posbackend.controller;

import jakarta.validation.Valid;
import org.example.posbackend.dto.CustomerDTO;
import org.example.posbackend.service.CustomerService;
import org.example.posbackend.utill.APIResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin(origins = "*")
@RestController
@RequestMapping("api/v1/customer")
public class CustomerController {


    @Autowired
    private CustomerService customerService;

    @PostMapping
    public ResponseEntity<APIResponse<String>> addCustomer(@RequestBody @Valid CustomerDTO customerDTO) {
        customerService.save(customerDTO);
  return new ResponseEntity<>(new APIResponse<>(201,"Customer Saved",null),HttpStatus.CREATED);


    }

    @PutMapping
    public ResponseEntity<APIResponse<String>> updateCustomer(@RequestBody CustomerDTO customerDTO) {
        customerService.update(customerDTO);
        return  new ResponseEntity<>(new APIResponse<>(200,"Customer Updated",null),HttpStatus.CREATED);

    }
@CrossOrigin(origins = "*")
@DeleteMapping("/{id}")
    public ResponseEntity<APIResponse<String>> deleteCustomer(@PathVariable String id) {
        customerService.delete(id);
        return new ResponseEntity<>(new APIResponse<>(200,"Customer Deleted",null),HttpStatus.OK);
}

@GetMapping("/all")
    public List<CustomerDTO> getAll() {
        return customerService.getAll();
}

}
