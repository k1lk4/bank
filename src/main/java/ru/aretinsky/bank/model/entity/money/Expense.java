package ru.aretinsky.bank.model.entity.money;

import lombok.Data;
import lombok.NoArgsConstructor;
import ru.aretinsky.bank.domain.Currency;

import javax.persistence.*;
import java.sql.Timestamp;

@Entity
@Data
@NoArgsConstructor
public class Expense {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    private int expenseId;

    @Column(length = 3, nullable = false)
    private Double commission;

    @Column(nullable = false)
    private Double commissionSum;

    private int sum;

    //card from which the transfer or purchase was made
    private int userCardId;

    private int userId;

    @Column(length = 100)
    private String receiverNameOrCardId;

    private Timestamp expenseDatetime;

    @Enumerated(EnumType.STRING)
    private Currency currency;
}
