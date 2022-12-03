package net.yorksolutions.pengmongthaoblogcmscapstonebe.services;

import net.yorksolutions.pengmongthaoblogcmscapstonebe.entities.Account;
import net.yorksolutions.pengmongthaoblogcmscapstonebe.repositories.AccountRepository;
import org.springframework.stereotype.Service;


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
        this.repo.save(request);
        return request;
    }
}
