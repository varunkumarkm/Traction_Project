package com.traction11;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomePage {

	@GetMapping("/")
	public String homePage() {
		return"homePage";
	}
	@GetMapping("/user")
	public String userPage() {
		return"userPage";
}
	@GetMapping("/admin")
	public String adminPage() {
		return"adminPage";
  }
}