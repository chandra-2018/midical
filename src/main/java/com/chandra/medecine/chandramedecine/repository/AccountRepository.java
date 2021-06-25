package com.chandra.medecine.chandramedecine.repository;

import com.chandra.medecine.chandramedecine.entity.Account;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AccountRepository extends CrudRepository<Account, Long> {

    Account findByEmailAndPassword(String email, String pssword);
}
