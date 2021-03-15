package ru.aretinsky.bank.controller.card;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import ru.aretinsky.bank.entity.Card;
import ru.aretinsky.bank.service.CardService;
import ru.aretinsky.bank.service.CardService;

@Controller
public class CardController {

    private final CardService cardService;

    @Autowired
    public CardController(CardService cardService) {
        this.cardService = cardService;
    }

    @PostMapping("/card/new")
    public String newCard(Card card) {

        return "redirect:/";
    }
}
