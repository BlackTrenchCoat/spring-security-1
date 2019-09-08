package org.theproject.springsecurityauthorization;

import org.springframework.security.core.Authentication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

// From https://github.com/habuma/spring-security-oauth2-jwt-example

@RestController
@RequestMapping("/secured")
public class SecuredController {

	@GetMapping
	public String securedResource(Authentication auth) {
		return "This is a SECURED resource. Authentication: " + auth.getName() + "; Authorities: " + auth.getAuthorities();
	}
	
}
