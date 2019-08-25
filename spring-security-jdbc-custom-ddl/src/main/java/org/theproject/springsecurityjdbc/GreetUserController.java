package org.theproject.springsecurityjdbc;

import org.springframework.security.core.Authentication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class GreetUserController {

    @RequestMapping("/")
    public String hello(Authentication auth) {
        return "Welcome " + auth.getName();
    }

}
