package ru.aretinsky.bank.entity;

import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.sql.Timestamp;

@Entity
@Data
@NoArgsConstructor
@Table(name = "cards")
public class Card {

    @Id
    private Integer id;

    @Column(length = 15)
    private String username;

    @Column(length = 40)
    private String email;

    @Column(length = 30)
    private String firstname;

    private Timestamp timestamp;

    @Column(length = 40)
    private String password;
}

