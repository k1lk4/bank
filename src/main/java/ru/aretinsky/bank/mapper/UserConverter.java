package ru.aretinsky.bank.mapper;

import org.springframework.stereotype.Component;
import ru.aretinsky.bank.model.dto.UserDto;
import ru.aretinsky.bank.model.entity.User;

@Component
public class UserConverter {

    public User toEntity(UserDto userDto) {
        return User.builder()
                .id(userDto.getId())
                .age(userDto.getAge())
                .email(userDto.getEmail())
                .firstname(userDto.getFirstname())
                .secondname(userDto.getSecondname())
                .birthDate(userDto.getBirthDate())
                .password(userDto.getPassword())
                .phone(userDto.getPhone())
                .country(userDto.getCountry())
                .registeredAt(userDto.getRegisteredAt())
                .sex(userDto.getSex())
                .login(userDto.getLogin())
                .build();
    }

    public UserDto toDto(User user) {
        return UserDto.builder()
                .id(user.getId())
                .age(user.getAge())
                .email(user.getEmail())
                .firstname(user.getFirstname())
                .secondname(user.getSecondname())
                .birthDate(user.getBirthDate())
                .password(user.getPassword())
                .phone(user.getPhone())
                .country(user.getCountry())
                .registeredAt(user.getRegisteredAt())
                .sex(user.getSex())
                .login(user.getLogin())
                .build();
    }
}
