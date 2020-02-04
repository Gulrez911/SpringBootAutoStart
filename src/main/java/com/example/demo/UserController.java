package com.example.demo;

import java.util.HashMap;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class UserController {

	@Autowired
	UserRepository repository;

	@GetMapping("/")
	public ModelAndView view() {
		ModelAndView mav = new ModelAndView("home");
//		User user = new User();
//		user.setFirstName("Gulrez");
//		user.setLastname("Farooqui");
//		user.setEmail("gulfarooqui1@gmail.com");
//		repository.save(user);
		return mav;
	}

	@GetMapping("/getUser")
	@ResponseBody
	public Map<String, Object> view2(@RequestParam long id) {
		Map<String, Object> map = new HashMap<>();
		User user = repository.getOne(id);
		System.out.println(user + "id: " + id);
		map.put("data", user);
		return map;
	}
}
