package com.greenfoxacademy.urlaliaser.controllers;

import com.greenfoxacademy.urlaliaser.models.Aliaser;
import com.greenfoxacademy.urlaliaser.services.AliasService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class MainController {

  private AliasService aliasService;

  @Autowired
  public MainController(AliasService aliasService) {
    this.aliasService = aliasService;
  }

  @GetMapping("/")
  public String getMainPage(@RequestParam(required = false, defaultValue = "false")
                                boolean aliasInUse, Model model) {
    model.addAttribute("aliasinuse", aliasInUse);
    return "main";
  }

  @PostMapping("/save-link")
  public String saveLink(@ModelAttribute Aliaser aliaser){

    return "main";
  }

/*
  @PostMapping("/save-link")
  public String saveLink(@RequestParam String url, @RequestParam String alias) {
    aliasService.checkWhetherAliasExists(alias);
    Aliaser aliaser = new Aliaser(url, alias, aliasService.generateSecretCode());

    return "main";
  }
*/

}
