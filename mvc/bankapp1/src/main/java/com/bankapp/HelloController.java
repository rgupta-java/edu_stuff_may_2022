package com.bankapp;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class HelloController {
	@GetMapping(path = "mypath")
	public ModelAndView hello(ModelAndView mv) {
		mv.setViewName("mypage");
		mv.addObject("mydata", "i am the champion i am the greatest");
		return mv;
	}
}
