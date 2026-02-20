package lk.ijse.posbackend.dto;


import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Positive;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data

public class OrderDetailDTO {
    @NotBlank(message = "Item id cant be null")
    private String itemId;

    @Positive(message = "must be greater than 0")
    private int itemQty;

    @Positive(message = "prices must be positive values")
    private double unitPrice;

}
