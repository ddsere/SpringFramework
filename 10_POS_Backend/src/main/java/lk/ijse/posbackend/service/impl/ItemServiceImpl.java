package lk.ijse.posbackend.service.impl;

import org.example.posbackend.dto.ItemDTO;
import org.example.posbackend.entity.Item;
import org.example.posbackend.exception.CustomException;
import org.example.posbackend.repository.ItemRepository;
import org.example.posbackend.service.ItemService;
import org.modelmapper.ModelMapper;
import org.modelmapper.TypeToken;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ItemServiceImpl implements ItemService {

    @Autowired
     private ItemRepository itemRepository;

    @Autowired
    private ModelMapper modelMapper;

    @Override
    public void save(ItemDTO itemDTO) {
        if(itemDTO==null){
            throw new NullPointerException("Item DTO is null");
        }
        if(itemRepository.existsById(itemDTO.getItemId())){
            throw new CustomException("Item already exists with this id");
        }
        itemRepository.save(modelMapper.map(itemDTO, Item.class));
    }

    @Override
    public void updateItem(ItemDTO itemDTO) {
        if(itemDTO==null){
            throw new NullPointerException("Item DTO is null");
        }
        itemRepository.save(modelMapper.map(itemDTO, Item.class));
    }

    @Override
    public void deleteItem(String id) {
        if(id==null){
            throw new NullPointerException("Item id is null");
        }
        itemRepository.deleteById(id);
    }

    @Override
    public List<ItemDTO> getAllItems() {
        return modelMapper.map(itemRepository.findAll(), new TypeToken<List<ItemDTO>>() {}.getType());
    }
}
