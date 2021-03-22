package ru.aretinsky.bank.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import ru.aretinsky.bank.model.entity.Card;

@Repository
public interface CardRepository extends CrudRepository<Card, Integer> {
    Boolean existsByCardId(Long id);
}
