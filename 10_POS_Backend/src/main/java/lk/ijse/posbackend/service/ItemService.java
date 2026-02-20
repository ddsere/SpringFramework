package lk.ijse.posbackend.service;

import lk.ijse.posbackend.dto.ItemDTO;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface ItemService {
    void save(ItemDTO itemDTO);
    void updateItem(ItemDTO itemDTO);
    void deleteItem(String id);
    List<ItemDTO> getAllItems();

}
