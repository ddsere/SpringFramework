package lk.ijse.posbackend.controller;

import jakarta.validation.Valid;
import lk.ijse.posbackend.dto.ItemDTO;
import lk.ijse.posbackend.service.ItemService;
import lk.ijse.posbackend.utill.APIResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin(origins = "*")
@RestController
@RequestMapping("api/v1/item")

public class ItemController {
    @Autowired
    private ItemService itemService;

    @PostMapping
   public ResponseEntity<APIResponse<String>> addItem(@RequestBody @Valid ItemDTO itemDTO){
        itemService.save(itemDTO);
        return new ResponseEntity<>(new APIResponse<>(201,"Item Added",null), HttpStatus.OK);
   }

   @PutMapping
   public ResponseEntity<APIResponse<String>> updateItem(@RequestBody @Valid ItemDTO itemDTO){
        itemService.updateItem(itemDTO);
        return new ResponseEntity<>(new APIResponse<>(200,"Item Updated",null), HttpStatus.OK);
   }
   @CrossOrigin(origins = "*")
   @DeleteMapping("/{id}")
   public ResponseEntity<APIResponse<String>> deleteItem(@PathVariable  @Valid String id ,Exception e){
        itemService.deleteItem(id);
        e.printStackTrace();
       return new ResponseEntity<>(new APIResponse<>(200,"Item Deleted",null), HttpStatus.OK);

   }
   @GetMapping("/all")
   public List<ItemDTO> getAll(){
        return itemService.getAllItems();
   }
}
