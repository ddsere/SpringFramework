package lk.ijse.posbackend.service;

import lk.ijse.posbackend.CustomerDto;
import lk.ijse.posbackend.entity.Customer;
import lk.ijse.posbackend.repository.CustomerRepo;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CustomerServiceImpl implements CustomerService {
    @Autowired
    private CustomerRepo customerRepo;

    @Autowired
    private ModelMapper modelMapper;

    @Override
    public void SaveCustomer(CustomerDto customerDto) {
        customerRepo.save(modelMapper.map(customerDto, Customer.class));
    }
}
