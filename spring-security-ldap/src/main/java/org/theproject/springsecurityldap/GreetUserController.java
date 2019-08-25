package org.theproject.springsecurityldap;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class GreetUserController {

    @RequestMapping("/")
    public String hello() {
        return "Welcome";
    }
}
