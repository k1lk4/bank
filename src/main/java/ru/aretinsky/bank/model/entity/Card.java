package ru.aretinsky.bank.model.entity;

import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.sql.Timestamp;

@Entity
@Data
@NoArgsConstructor
public class Card {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(length = 15, nullable = false)
    private Long ownerId;

    @Column(nullable = false)
    private Timestamp createdAt;

    @Column(length = 40, nullable = false)
    private String password;

    @Column(length = 16, nullable = false)
    private Long cardId;

    @Column(length = 3, nullable = false)
    private int cardCvv;
}

