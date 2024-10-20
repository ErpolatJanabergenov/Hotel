package uz.hotel.hotel.controller;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;
import uz.hotel.hotel.dto.request.UserRequestDTO;
import uz.hotel.hotel.dto.response.UserResponseDTO;
import uz.hotel.hotel.service.UserService;

@RestController
@RequiredArgsConstructor
@RequestMapping("/auth")

public class AuthController {

    private  final UserService userService;

//    @PreAuthorize("hasRole('ADMIN') and hasAuthority('USER')")
    @PostMapping("/register")
    public UserResponseDTO register(@RequestBody UserRequestDTO userRequestDTO) {
      return userService.registerUser(userRequestDTO);
    }

    @GetMapping("/login")
    public String login(@RequestBody UserRequestDTO userRequestDTO) {
        return  userService.login(userRequestDTO);
    }
}
