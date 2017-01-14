package ml.sadriev.service.impl;

import ml.sadriev.model.Account;
import ml.sadriev.repository.AccountRepository;
import ml.sadriev.service.AccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AccountServiceImpl implements AccountService {

    @Autowired
    private AccountRepository accountRepository;

    @Override
    public Account addAccount(Account account) {
        Account savedAccount = accountRepository.saveAndFlush(account);

        return savedAccount;
    }

    @Override
    public void delete(Long id) {
        AccountRepository.delete(id);
    }
}
