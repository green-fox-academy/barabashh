package com.greenfoxacademy.aliaser.controllers;

import com.greenfoxacademy.aliaser.exceptions.ResourceNotFoundException;
import com.greenfoxacademy.aliaser.models.Aliaser;
import com.greenfoxacademy.aliaser.services.AliasService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class MainController {

  private AliasService aliasService;

  @Autowired
  public MainController(AliasService aliasService) {
    this.aliasService = aliasService;
  }

  @GetMapping("/")
  public String getMain(@RequestParam(required = false) Boolean success,
                        @RequestParam(required = false, defaultValue = "false") Boolean error,
                        @RequestParam(required = false) String link,
                        @RequestParam(required = false) String alias,
                        @RequestParam(required = false) String secretCode,
                        Model model) {
    model.addAttribute("success", success);
    model.addAttribute("error", error);
    model.addAttribute("link", error ? link : "");
    model.addAttribute("alias", error ? alias : "");
    model.addAttribute("aliasName", error ? "" : alias);
    model.addAttribute("secretCode", error ? "" : secretCode);
    return "main";
  }

  @PostMapping("/save-link")
  public String saveLink(@ModelAttribute Aliaser aliaser) {
    if (aliasService.findIfAliasExists(aliaser.getAlias())) {
      return "redirect:/?error=true&link=" + aliaser.getLink() + "&alias=" + aliaser.getAlias();
    }
    Aliaser aliaser1 = new Aliaser(aliaser.getLink(), aliaser.getAlias()
        , aliasService.generateSecretCode(), 0);
    aliasService.saveAliaser(aliaser1);
    return "redirect:/?success=true&secretCode=" + aliaser1.getSecretCode()
        + "&alias=" + aliaser1.getAlias();
  }

  @GetMapping("/a/{alias}")
  public String redirectToUrl(@PathVariable String alias) throws ResourceNotFoundException {
    if (aliasService.findIfAliasExists(alias)) {
      Aliaser aliaser = aliasService.findAliaserByAlias(alias);
      aliaser.setHitNumber(aliaser.getHitNumber() + 1);
      aliasService.saveAliaser(aliaser);
      return "redirect:" + aliaser.getLink();
    } else {
      throw new ResourceNotFoundException();
    }
  }

}
