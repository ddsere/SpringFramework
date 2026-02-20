package lk.ijse.posbackend.controller;


import org.example.posbackend.dto.OrderDTO;
import org.example.posbackend.service.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@CrossOrigin("*")
@RestController
@RequestMapping("api/v1/order")
public class OrderController {
    @Autowired
    private OrderService orderService;

    @PostMapping
    public void placeOrder(@RequestBody OrderDTO orderDTO) {
        orderService.placeOrder(orderDTO);
    }
}
