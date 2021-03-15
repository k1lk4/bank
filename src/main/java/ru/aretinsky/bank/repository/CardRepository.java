package ru.aretinsky.bank.repository;

import org.springframework.data.repository.CrudRepository;
import ru.aretinsky.bank.entity.Card;

public interface CardRepository extends CrudRepository<Card, Integer> {
    Card findByUsername(String username);
}
