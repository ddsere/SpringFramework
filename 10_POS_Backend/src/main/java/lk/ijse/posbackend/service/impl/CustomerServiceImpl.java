package lk.ijse.posbackend.service.impl;

import org.example.posbackend.dto.CustomerDTO;
import org.example.posbackend.entity.Customer;
import org.example.posbackend.exception.CustomException;
import org.example.posbackend.repository.CustomerRepository;
import org.example.posbackend.service.CustomerService;
import org.modelmapper.ModelMapper;
import org.modelmapper.TypeToken;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CustomerServiceImpl implements CustomerService {

    @Autowired
    private CustomerRepository customerRepository;

    @Autowired
    private ModelMapper modelMapper;

    @Override
    public void save(CustomerDTO customerDTO) {

        if (customerDTO == null) {
            throw new NullPointerException("Customer DTO is null");
        }
        if(customerRepository.existsById(customerDTO.getId())) {

            throw new CustomException("Customer already exists with this id");
        }
        customerRepository.save(modelMapper.map(customerDTO, Customer.class));


    }

    @Override
    public void update(CustomerDTO customerDTO) {
        if (customerDTO == null) {
            throw new NullPointerException("Customer DTO is null");
        }

        customerRepository.save(modelMapper.map(customerDTO, Customer.class));
    }

    @Override
    public void delete(String id) {
        if(id==null){
            throw new NullPointerException("Customer id is null");
        }
        customerRepository.deleteById(id);
    }

    @Override
    public List<CustomerDTO> getAll() {
        return modelMapper.map(customerRepository.findAll(), new TypeToken<List<CustomerDTO>>() {}.getType());
    }


}
