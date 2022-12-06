package net.yorksolutions.pengmongthaoblogcmscapstonebe.services;

import net.yorksolutions.pengmongthaoblogcmscapstonebe.entities.Account;
import net.yorksolutions.pengmongthaoblogcmscapstonebe.repositories.AccountRepository;
import org.springframework.stereotype.Service;

import java.util.Optional;


@Service
public class AccountService {

    AccountRepository repo;

    public AccountService(AccountRepository repo) {
        this.repo = repo;
    }

    public Iterable<Account> getAllAccounts() {
        return this.repo.findAll();
    }

    public Account getAccountById(Long id) {
        return this.repo.findById(id).orElseThrow();
    }

    public Account createAccount(Account request) {
        this.repo.save(request);
        return request;
    }

    public Account updateAccount(Account request) {
        return this.repo.save(request);
    }

    public Account getAccountByUsername(String username) {
        Account accountFound = this.repo.findAccountByUsername(username);
        if(accountFound != null){
            return this.repo.findAccountByUsername(username);
        }
        return null;
    }
}
