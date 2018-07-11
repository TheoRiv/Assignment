package com.assignment.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.assignment.bean.LoginBean;

//This is our controller, it will check if the information that is entered is correct.

@Controller
public class LoginController {

	@RequestMapping(value = "login", method = RequestMethod.GET)
	public String init(Model model) {
		model.addAttribute("message", "Enter your login information");
		return "login.jsp";
	}

	@RequestMapping(method = RequestMethod.POST)
	public String submit(Model model, @ModelAttribute("loginBean") LoginBean loginBean) {
		if (loginBean != null && loginBean.getId() != null && loginBean.getPassword() != null) {
			if (loginBean.getId().equals("admin") && loginBean.getPassword().equals("admin")) { // We check if the
																								// information is
																								// correct
				model.addAttribute("message", loginBean.getId());
				return "welcome.jsp"; // if the information is correct, you are directed to the page welcome.jsp
			} else {
				model.addAttribute("error", "Wrong information"); // if not, you are sent to the same page with an error
				return "login.jsp";
			}
		} else {
			model.addAttribute("error", "Enter your information");
			return "login.jsp";
		}
	}

}
