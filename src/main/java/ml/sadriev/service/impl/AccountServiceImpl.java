package ml.sadriev.service.impl;

import ml.sadriev.model.Account;
import ml.sadriev.repository.AccountRepository;
import ml.sadriev.service.AccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class AccountServiceImpl implements AccountService {

    @Autowired
    private AccountRepository accountRepository;

    @Override
    @Transactional
    public Account addAccount(Account account) {
        Account savedAccount = accountRepository.saveAndFlush(account);

        return savedAccount;
    }

    @Override
    public List<Account> getAll() {
        return accountRepository.findAll();
    }

    @Override
    @Transactional
    public void delete(Long id) {
        accountRepository.delete(id);
    }
}
