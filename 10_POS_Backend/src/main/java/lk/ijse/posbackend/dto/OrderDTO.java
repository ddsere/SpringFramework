package lk.ijse.posbackend.dto;


import jakarta.validation.constraints.NotBlank;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;
@AllArgsConstructor
@NoArgsConstructor
@Data

public class OrderDTO {
    @NotBlank(message = "Item id cant be null")
    private String orderID;
    private String date;

    @NotBlank(message = "Customer id cant be null")
    private String customerID;

    private List<OrderDetailDTO> orderDetailDTOList;

}
