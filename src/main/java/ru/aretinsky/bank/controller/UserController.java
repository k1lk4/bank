package ru.aretinsky.bank.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import ru.aretinsky.bank.model.dto.UserDto;
import ru.aretinsky.bank.model.entity.User;
import ru.aretinsky.bank.service.UserService;

@Controller
public class UserController {

    private final UserService userService;

    @Autowired
    public UserController(UserService userService) {
        this.userService = userService;
    }

    @GetMapping("/bank/reg")
    public String registration(Model model) {
        model.addAttribute("user", new User());
        return "registration";
    }

    @PostMapping("/bank/reg/submit")
    public String submitRegistration(@ModelAttribute("user") UserDto userDto) {
        userService.save(userDto);
        return "redirect:/";
    }

    @GetMapping("/bank/login")
    public String login(Model model) {
        model.addAttribute("user", new User());
        return "login";
    }
}
