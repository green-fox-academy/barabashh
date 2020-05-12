package com.greenfoxacademy.simba.models;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class Bank {
  private List<BankAccount> bankAccounts = new ArrayList<>();

  public void addBankAccount(BankAccount bankAccount) {
    bankAccounts.add(bankAccount);
  }

  public BankAccount getBankAccountByName(String userName) {
    Optional<BankAccount> optionalBankAccount = bankAccounts
        .stream()
        .filter(a -> a.getName().equals(userName))
        .findFirst();
    if (optionalBankAccount.isPresent()){
      return optionalBankAccount.get();
    }else
    {
      return null;
    }
  }
}
