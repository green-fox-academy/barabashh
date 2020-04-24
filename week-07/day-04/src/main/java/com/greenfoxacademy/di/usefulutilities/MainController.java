package com.greenfoxacademy.di.usefulutilities;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequestMapping("/useful")
public class MainController {
  private UtilityService utilityService;

  @Autowired
  public MainController(UtilityService utilityService) {
    this.utilityService = utilityService;
  }

  @GetMapping("")
  public String Index() {
    return "index";
  }

  @GetMapping("/colored")
  public String colored(Model model){
    model.addAttribute("backGroundColor",utilityService.randomColor());
    return "colored";
  }

  @GetMapping("/email")
  public String emailValidator(@RequestParam("email") String email, Model model){
    model.addAttribute("emailAddress",email);
    model.addAttribute("isValid",utilityService.validateEmail(email));
    return "email";
  }
}
