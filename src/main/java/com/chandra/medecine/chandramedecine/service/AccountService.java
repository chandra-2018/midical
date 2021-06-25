package com.chandra.medecine.chandramedecine.service;


import com.chandra.medecine.chandramedecine.entity.Account;

public interface AccountService {
    void registerNewAccount(Account account);

    Account validateuser(String email, String password);
}
