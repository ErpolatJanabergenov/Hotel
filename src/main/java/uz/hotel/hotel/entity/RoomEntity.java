package uz.hotel.hotel.entity;

import jakarta.persistence.Entity;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity(name = "room")
@AllArgsConstructor
@NoArgsConstructor
@Data
public class RoomEntity extends BaseEntity {
    private int roomNumber;
    private Category category;
    private int capacity;
    private double price;

}
