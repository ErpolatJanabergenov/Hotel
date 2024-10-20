package uz.hotel.hotel.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;
import java.util.UUID;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class BaseDTO {
    private UUID id;
    private LocalDateTime createdDate;
    private LocalDateTime updatedDate;
}
