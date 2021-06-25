package com.chandra.medecine.chandramedecine.serviceImpl;

import com.chandra.medecine.chandramedecine.entity.Account;
import com.chandra.medecine.chandramedecine.repository.AccountRepository;
import com.chandra.medecine.chandramedecine.service.AccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AccountServiceImpl implements AccountService {

    @Autowired
    AccountRepository accountRepo;

    @Override
    public void registerNewAccount(Account account) {
        accountRepo.save(account);
    }

    @Override
    public Account validateuser(String email, String password) {
        return accountRepo.findByEmailAndPassword(email, password);
    }


}
