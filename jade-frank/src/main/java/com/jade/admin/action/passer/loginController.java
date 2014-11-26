package com.jade.admin.action.passer;

import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping("/passer")
public class loginController {

	@RequestMapping(value = "/login.html",method = RequestMethod.GET)
	public String login(Model model, HttpSession session){
		return "index";
	}
}
