package lk.ijse.posbackend.service;

import org.example.posbackend.dto.CustomerDTO;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface CustomerService {
     void save(CustomerDTO customerDTO);
     void update(CustomerDTO customerDTO);
     void delete (String id);
     List<CustomerDTO> getAll();
}
