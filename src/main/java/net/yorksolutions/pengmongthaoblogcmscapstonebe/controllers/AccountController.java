package net.yorksolutions.pengmongthaoblogcmscapstonebe.controllers;

import net.yorksolutions.pengmongthaoblogcmscapstonebe.entities.Account;
import net.yorksolutions.pengmongthaoblogcmscapstonebe.services.AccountService;
import org.springframework.web.bind.annotation.*;


@RestController
@RequestMapping("/api/account")
@CrossOrigin
public class AccountController {
    AccountService service;

    public AccountController(AccountService service) {
        this.service = service;
    }

    @GetMapping("/all")
    public Iterable<Account> getAllAccounts(){
        return this.service.getAllAccounts();
    }

    @GetMapping("/{id}")
    public Account getAccountById(@PathVariable Long id){
        return this.service.getAccountById(id);
    }

    @PostMapping
    public Account createAccount(@RequestBody Account request){
        return this.service.createAccount(request);
    }

    @PutMapping Account updateAccount(@RequestBody Account request){
        return this.service.updateAccount(request);
    }
}
