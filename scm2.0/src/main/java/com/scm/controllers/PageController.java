package com.scm.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;


@Controller
public class PageController {

    @RequestMapping("/home")
    
    public String home(org.springframework.ui.Model model) {
        System.out.println("Inside home handler");
       model.addAttribute("name","Substring tech");
       model.addAttribute("YoutubeChannel","The knowledge Hunk");
       model.addAttribute("Github","Kundanx64");

       
        return "home";
    }

    //about route
    @RequestMapping("/about")
    public String aboutPage() {
        System.out.println("Inside about handler");
        return "about"; 
    }

    //services
    @RequestMapping("/services")
    public String servicesPage() {
        System.out.println("Inside services handler");
        return "services";
    }
    
    //contact page
    @GetMapping("/contact")
    public String contact() {
        return new String("contact");
    }
    
    //login page
    @GetMapping("/login")
    public String login() {
        return new String("login");
    }
    
    //signup page
    @GetMapping("/signup")
    public String signup() {
        return new String("signup");
    }
    
    //register page 
    @GetMapping("/register")
    public String register() {
        return new String("register");
    }
    

}
