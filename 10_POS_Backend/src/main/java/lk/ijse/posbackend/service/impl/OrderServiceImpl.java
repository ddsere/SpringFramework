package lk.ijse.posbackend.service.impl;

import org.example.posbackend.dto.OrderDTO;
import org.example.posbackend.dto.OrderDetailDTO;
import org.example.posbackend.entity.Item;
import org.example.posbackend.entity.OrderDetail;
import org.example.posbackend.entity.Orders;
import org.example.posbackend.repository.ItemRepository;
import org.example.posbackend.repository.OrderDetailRepository;
import org.example.posbackend.repository.OrderRepository;
import org.example.posbackend.service.OrderService;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;


@Service
@Transactional

public class OrderServiceImpl implements OrderService {

@Autowired
private OrderDetailRepository orderDetailRepository;

@Autowired
private ItemRepository itemRepository;

@Autowired
private OrderRepository orderRepository;

@Autowired
private ModelMapper modelMapper;


    @Override
    public void placeOrder(OrderDTO orderDTO) {
        Orders order = new Orders(
                orderDTO.getOrderID(),
                orderDTO.getDate(),
                orderDTO.getCustomerID()
        );
        orderRepository.save(order);


        for(OrderDetailDTO detail : orderDTO.getOrderDetailDTOList()) {
            OrderDetail orderDetail = new OrderDetail(
                    orderDTO.getOrderID(),
                    detail.getItemId(),
                    detail.getItemQty(),
                    detail.getUnitPrice()

                    );
            orderDetailRepository.save(orderDetail);

            Item item = itemRepository.findById(detail.getItemId()).get();
            int currentQty = Integer.parseInt(item.getItemQuantity());
            item.setItemQuantity(String.valueOf(currentQty-detail.getItemQty()));
            itemRepository.save(item);
        }




    }
}
