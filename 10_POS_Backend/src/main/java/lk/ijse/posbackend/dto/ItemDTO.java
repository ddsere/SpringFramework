package lk.ijse.posbackend.dto;


import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Positive;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data

public class ItemDTO {

    @NotBlank(message = "Item id is mandatory")
    private String itemId;

    @NotBlank(message = "item name is mandatory")
    private String itemName;

    @Positive(message = "Price must be greater than 0")
    private String itemPrice;

    @Min(value = 1,message = "Quantity must be")
    private String itemQuantity;
}
