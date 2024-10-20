package uz.hotel.hotel.dto.response;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import uz.hotel.hotel.dto.BaseDTO;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class UserResponseDTO extends BaseDTO {
    private String gmail;
}
