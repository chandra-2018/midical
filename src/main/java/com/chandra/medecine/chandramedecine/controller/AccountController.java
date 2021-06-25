package com.chandra.medecine.chandramedecine.controller;

import com.chandra.medecine.chandramedecine.constant.AppConstant;
import com.chandra.medecine.chandramedecine.entity.Account;
import com.chandra.medecine.chandramedecine.serviceImpl.AccountServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(value = AppConstant.API + AppConstant.API_VERSION, produces = AppConstant.APPLICATION_JSON)
public class AccountController {

    @Autowired
    AccountServiceImpl accountService;

    @RequestMapping(value = AppConstant.REGISTER_ACCOUNT, method = RequestMethod.POST, produces = AppConstant.APPLICATION_JSON)
     public ResponseEntity<?> registerUser(@RequestBody Account account){
         accountService.registerNewAccount(account);
         return ResponseEntity.ok("Account created");
    }

    @RequestMapping(value = AppConstant.ACCOUNT_LOGIN, method = RequestMethod.GET, produces = AppConstant.APPLICATION_JSON)
    public ResponseEntity<Account> accountLogin(@RequestParam("email") String email, @RequestParam("password") String password){
        return ResponseEntity.ok(accountService.validateuser(email, password));
    }

    @RequestMapping(value = "/hello", method = RequestMethod.GET, produces = AppConstant.APPLICATION_JSON)
    public String hello(){
        return "HELLO";
    }

}
