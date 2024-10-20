package uz.hotel.hotel.entity;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.ManyToOne;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity(name = "card")
@AllArgsConstructor
@NoArgsConstructor
@Data
public class CardEntity extends BaseEntity {

    private String cardName;
    @Column(unique = true, nullable = false)
    private String cardNumber;
    private CardType cardType;
    private Double balance;
    @ManyToOne
    @JsonIgnore
    private UserEntity user;
}
