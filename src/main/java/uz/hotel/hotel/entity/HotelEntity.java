package uz.hotel.hotel.entity;

import jakarta.persistence.Entity;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity(name = "hotel")
@AllArgsConstructor
@NoArgsConstructor
@Data
public class HotelEntity extends BaseEntity {
    private String name;
    private String address;
    private String city;
    private int stars;
}
