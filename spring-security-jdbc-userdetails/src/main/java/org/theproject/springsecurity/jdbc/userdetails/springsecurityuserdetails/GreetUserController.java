package org.theproject.springsecurity.jdbc.userdetails.springsecurityuserdetails;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.Authentication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.stream.Collectors;

@RestController
public class GreetUserController {

    @Autowired
    UserRepository userRepository;

    @RequestMapping("/")
    public String hello(Authentication auth) {
        return "Welcome " + auth.getName();
    }

    @RequestMapping("/list")
    public List<String> getUserNames() {
        List<User> users = userRepository.findAll();
        return users.stream().map(User::getUsername).collect(Collectors.toList());
    }

}
