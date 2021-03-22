package ru.aretinsky.bank.model.dto;

import lombok.*;
import ru.aretinsky.bank.domain.Country;

import java.sql.Date;
import java.sql.Timestamp;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class UserDto {
    private int id;

    private String password;

    private String login;

    private String firstname;

    private String secondname;

    private String email;

    //with country code
    private long phone;

    private Country country;

    private int age;

    //1 - women, 0 - man
    private Boolean sex;

    private Date birthDate;

    private Timestamp registeredAt;
}
