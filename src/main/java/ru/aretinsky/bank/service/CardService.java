package ru.aretinsky.bank.service;

import lombok.extern.java.Log;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;
import ru.aretinsky.bank.model.entity.Card;
import ru.aretinsky.bank.repository.CardRepository;

import java.util.Random;

@Service
@Log
public class CardService implements UserDetailsService {

    private final CardRepository cardRepository;

    @Autowired
    public CardService(CardRepository cardRepository) {
        this.cardRepository = cardRepository;
    }

    /**
     * Generates unique 16-digit card id (ex. 8900 0123 4567 2345)
     * First 4 digits are always 8900
     */
    public Long generateCardId() {
        StringBuilder cardId_string = new StringBuilder("8900");
        for (int i = 0; i < 12; i++) {
            int number = (int) (Math.random() * 9);
            cardId_string.append(number);
        }
        long cardId = Long.parseLong(String.valueOf(cardId_string));

        if (existsByCardId(cardId))
            return generateCardId();
        else
            return cardId;
    }

    /**
     * Generates random 3-digit card cvv (ex. 425)
     */
    public int generateCardCVV() {
        Random random = new Random();
        //result will be [107;999]
        return random.nextInt(892) + 107;
    }


    public Card findByCardId(int id) {
        return cardRepository.findById(id).orElseThrow(() -> new RuntimeException("card id: " + id));
    }

    public void deleteById(int id) {
        cardRepository.deleteById(id);
    }

    public Boolean existsByCardId(Long id) {
        return cardRepository.existsByCardId(id);
    }

    @Override
    public UserDetails loadUserByUsername(String s) throws UsernameNotFoundException {
        return null;
    }


}
