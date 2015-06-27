package com.archeryScoringApp.mark.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.archeryScoringApp.mark.domain.Archer;
import com.archeryScoringApp.mark.domain.User;
import com.archeryScoringApp.mark.service.ArcherService;
import com.archeryScoringApp.mark.service.UserService;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

@Controller
public class archeryAppController {
	
	@Autowired
	private UserService userService;
	@Autowired
	private ArcherService archerService;

	@RequestMapping("/login")
	public String anythingReally(){
		System.out.println("login");
		return "login";
	}
	
	@RequestMapping("/validateLogin")
	public String validateTheUser(Model model, HttpServletRequest request, HttpSession session,
			@RequestParam("userName") String userName,
			@RequestParam("password") String password){
		String page = "login";
		request.getSession(true);
		session.setMaxInactiveInterval(30*60);
		
		User user = userService.getUserByName(userName,password);
		
			if(user.getUserName() == null){
				page = "login";
			}else if(user.getRole().equals("ROLE_ADMIN")) {
				page = "adminPage";
			}else if(user.getRole().equals("ROLE_USER")){
				page = "home";
			}
		return page;
	}

	@RequestMapping("/Home")
	//@RequestMapping("/Archers")
	public String Archers(Model model, HttpServletRequest request, HttpSession session){
		return "home";
	}
	
	@RequestMapping("/InputArcher")
	public String InputArcher(Model model, HttpServletRequest request, HttpSession session){
		
	return "inputArcherInfo";
	}
	
	@RequestMapping("/AddArcher")
	public String addArchers(Model model, HttpServletRequest request, HttpSession session,
			@RequestParam("firstName") String firstName,
			@RequestParam("lastName") String lastName,
			@RequestParam("club") String club,
			@RequestParam("email") String email){
		System.out.println("firstname: "+firstName);
		Archer archer = new Archer(lastName,firstName,email,null,club);
		archerService.addArcher(archer);	
		model.addAttribute("archerName","You've added : "+lastName );
		//model.addAttribute("archerFname", firstName);
		
		List<Archer> archers = archerService.getAllArchers();
		for(Archer a: archers){
			System.out.println(a.getLname());
		}
		
		Archer archerRecentlyAdded = archerService.getParticularArcher(firstName, lastName);
		System.out.println(archerRecentlyAdded);
		model.addAttribute("recentlyAdded", "You Have Recently Added Archer:");
		model.addAttribute("archerRecentlyAdded", archerRecentlyAdded);
	return "inputArcherInfo";
	}
	
	@RequestMapping("/ListOfArchers")
	public String listOfArchers(Model model, HttpServletRequest request, HttpSession session){
		List<Archer> archers = archerService.getAllArchers();
		for(Archer a: archers){
			System.out.println(a.getLname());
		}
		model.addAttribute("listOfArchers", archers);
		return "listOfArchers";
	}
}
