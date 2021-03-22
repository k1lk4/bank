package ru.aretinsky.bank.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;
import ru.aretinsky.bank.mapper.UserConverter;
import ru.aretinsky.bank.model.dto.UserDto;
import ru.aretinsky.bank.model.entity.User;
import ru.aretinsky.bank.repository.UserRepository;

@Service
public class UserService {

    private final UserRepository userRepository;
    private final UserConverter userConverter;
    private final PasswordEncoder passwordEncoder;

    @Autowired
    private UserService(UserRepository userRepository, UserConverter userConverter, PasswordEncoder passwordEncoder) {
        this.userRepository = userRepository;
        this.userConverter = userConverter;
        this.passwordEncoder = passwordEncoder;
    }

    public User save(UserDto userDto) {
        userDto.setPassword(passwordEncoder.encode(userDto.getPassword()));
        userDto.setPhone(Long.parseLong(userDto.getCountry().code + "" + userDto.getPhone()));
        return userRepository.save(userConverter.toEntity(userDto));
    }
}
