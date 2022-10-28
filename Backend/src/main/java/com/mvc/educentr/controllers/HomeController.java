package com.mvc.educentr.controllers;

import com.mvc.educentr.models.Employer;
import com.mvc.educentr.models.Mentor;
import com.mvc.educentr.models.User;
import com.mvc.educentr.repos.EmployerRepository;
import com.mvc.educentr.repos.MentorRepository;
import com.mvc.educentr.repos.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class HomeController {

    @Autowired
    private UserRepository userRepository;

    @Autowired
    private MentorRepository mentorRepository;

    @Autowired
    private EmployerRepository employerRepository;

    @GetMapping("/")
    public String index() {
        return "index";
    }

    @GetMapping("/register")
    public String register() {
        return "register";
    }

    @GetMapping("/login")
    public String login() {
        return "login";
    }

    @PostMapping("/login")
    public @ResponseBody String loginUser(@RequestParam String email,
                                          @RequestParam String password) {
        return "Авторизовано. Поверніться на головну сторінку.";
    }

    @PostMapping("/register")
    public @ResponseBody String registerUser (@RequestParam String initials, @RequestParam Integer usertype,
                                              @RequestParam String email, @RequestParam String password)
    {
        switch (usertype) {
            case (1) -> {
                User user = new User();
                user.setInitials(initials);
                user.setEmail(email);
                user.setPassword(password);
                userRepository.save(user);
            }
            case (2) -> {
                Mentor mentor = new Mentor();
                mentor.setInitials(initials);
                mentor.setEmail(email);
                mentor.setPassword(password);
                mentorRepository.save(mentor);
            }
            case (3) -> {
                Employer employer = new Employer();
                employer.setInitials(initials);
                employer.setEmail(email);
                employer.setPassword(password);
                employerRepository.save(employer);
            }
        }
        return "Зареєстровано. Поверніться на головну сторінку";
    }

}
