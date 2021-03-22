package ru.aretinsky.bank.model.entity.money;

import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity
@NoArgsConstructor
@Data
public class Transaction {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    //first 4 digits of card are always 8900
    @Column(length = 16, nullable = false)
    private Long receiverCardId;

    //first 4 digits of card are always 8900
    @Column(length = 16, nullable = false)
    private Long senderCardId;



}
