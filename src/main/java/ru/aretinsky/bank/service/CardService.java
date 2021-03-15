package ru.aretinsky.bank.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import ru.aretinsky.bank.entity.Card;
import ru.aretinsky.bank.repository.CardRepository;

@Service
public class CardService {

    private final CardRepository cardRepository;

    @Autowired
    public CardService(CardRepository cardRepository) {
        this.cardRepository = cardRepository;
    }

    public Card findByCardId(Integer id) {
        return cardRepository.findById(id).get();
    }

    public Card findByUsername(String username) {
        return cardRepository.findByUsername(username);
    }

    public Card add(Card card) {
        return cardRepository.save(card);
    }

    public void deleteById(Integer id) {
        cardRepository.deleteById(id);
    }
}
