package com.demo;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class HelloController {
	@GetMapping(path = "hello")
	public ModelAndView hello(ModelAndView mv) {
		mv.setViewName("hello");
		mv.addObject("key", "srping mvc");
		return mv;
	}
}
