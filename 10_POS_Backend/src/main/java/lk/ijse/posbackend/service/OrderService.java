package lk.ijse.posbackend.service;

import org.example.posbackend.dto.OrderDTO;
import org.springframework.stereotype.Service;

@Service
public interface OrderService {
    void placeOrder(OrderDTO orderDTO);
}
