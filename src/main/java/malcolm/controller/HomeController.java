/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package malcolm.controller;

import malcolm.services.HomeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/")
public class HomeController {
    
    
    @Autowired
    private HomeService homeService;
    
    
    @RequestMapping("/")
    public String showHome (Model model){
    String message = homeService.welcomeMessage();
    model.addAttribute("welcomeMessage", message);
    return "home";
    }
}
