package ml.sadriev.service;

import ml.sadriev.model.Account;
import java.util.List;

public interface AccountService {
    Account addAccount(Account account);
    void delete(Long id);
    List<Account> getAll();
}
