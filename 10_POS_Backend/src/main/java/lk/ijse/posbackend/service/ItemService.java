package lk.ijse.posbackend.service;

import org.example.posbackend.dto.ItemDTO;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface ItemService {
    void save(ItemDTO itemDTO);
    void updateItem(ItemDTO itemDTO);
    void deleteItem(String id);
    List<ItemDTO> getAllItems();

}
