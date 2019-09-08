package org.theproject.springsecurityjdbc;

import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.security.Principal;
import java.util.stream.Collectors;

@RestController
public class GreetUserController {

    @RequestMapping("/")
    public String hello(Authentication auth) {
        return "Welcome " + auth.getName();
    }

    @RequestMapping("/principal")
    public String helloPrincipal(Principal principal) {
        return "Welcome " + principal.getName() +
                ", your authorities are " +
                ((UsernamePasswordAuthenticationToken) principal).getAuthorities().stream()
                        .map(x -> x.toString())
                        .collect(Collectors.joining(", "));
    }

}
