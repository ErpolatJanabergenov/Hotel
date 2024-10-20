package uz.hotel.hotel.service;

import lombok.RequiredArgsConstructor;
import org.modelmapper.ModelMapper;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;
import uz.hotel.hotel.dto.request.UserRequestDTO;
import uz.hotel.hotel.dto.response.UserResponseDTO;
import uz.hotel.hotel.entity.UserEntity;
import uz.hotel.hotel.entity.UserRole;
import uz.hotel.hotel.repository.UserRepository;

import java.util.Optional;
import java.util.Random;

@Service
@RequiredArgsConstructor
public class UserService {

    private final ModelMapper modelMapper;

    private  final PasswordEncoder passwordEncoder;
    private final UserRepository userRepository;

    public UserResponseDTO registerUser(UserRequestDTO user) {
        user.setPassword(passwordEncoder.encode(user.getPassword()));
        UserEntity userEntity = modelMapper.map(user, UserEntity.class);

//        userEntity.setRole(UserRole.ROLE_USER);

        userRepository.save(userEntity);
        return modelMapper.map(userEntity, UserResponseDTO.class);
    }


    public String login(UserRequestDTO userRequestDTO) {
        Optional<UserEntity> user = userRepository.findByGmail(userRequestDTO.getGmail());
        if ( user.get().getGmail().equals(userRequestDTO.getGmail())
                && user.get().getPassword().equals(userRequestDTO.getPassword())) {
        return "success";
        }else {
            return "gmail or password is incorrect";
        }
    }
}
