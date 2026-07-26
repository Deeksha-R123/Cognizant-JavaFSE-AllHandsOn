package com.cognizant.account.controller;

import com.cognizant.account.model.Account;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AccountController {

    @GetMapping("/account")
    public Account getAccount() {

        Account account = new Account();
        account.setAccountNumber(1001);
        account.setAccountHolderName("John Doe");
        account.setAccountType("Savings");
        account.setBalance(50000.0);

        return account;
    }
}