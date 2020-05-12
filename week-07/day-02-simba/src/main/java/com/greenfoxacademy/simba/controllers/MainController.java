package com.greenfoxacademy.simba.controllers;

import com.greenfoxacademy.simba.models.Bank;
import com.greenfoxacademy.simba.models.BankAccount;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class MainController {
  private Bank bank;

  public MainController() {
    bank = new Bank();
    bank.addBankAccount(new BankAccount("Simba", 2000, "lion"));
  }

  @GetMapping(path = "/show")
  public String show(Model model) {
    model.addAttribute("bankAccount",bank.getBankAccountByName("Simba"));
    return "HTMLception";
  }
}
