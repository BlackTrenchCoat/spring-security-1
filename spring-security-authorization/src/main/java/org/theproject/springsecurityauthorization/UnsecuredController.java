package org.theproject.springsecurityauthorization;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

// From https://github.com/habuma/spring-security-oauth2-jwt-example

@RestController
@RequestMapping("/unsecured")
public class UnsecuredController {

	@GetMapping
	public String unsecuredResource() {
		return "This is an unsecured resource";
	}
	
}
