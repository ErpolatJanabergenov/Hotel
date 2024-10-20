package uz.hotel.hotel.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import uz.hotel.hotel.entity.HotelEntity;

import java.util.UUID;

@Repository
public interface HotelRepository extends JpaRepository<HotelEntity, UUID> {
}
