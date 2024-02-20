package mobi.foo.mockingTask.services;

import mobi.foo.mockingTask.apis.BankClientAPI;
import mobi.foo.mockingTask.models.Account;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AccountService {
    private final BankClientAPI bankAPI;

    public AccountService(BankClientAPI bankApi) {
        this.bankAPI = bankApi;
    }

    public List<Account> getAccounts() {
        return bankAPI.getAccounts();
    }

    public boolean retrieveTransfer(Account sourceAccount, Account destinationAccount) {
        return bankAPI.retrieveTransfer(sourceAccount, destinationAccount);
    }

    public boolean retrieveLoanPayment(Account account) {
        return bankAPI.retrieveLoanPayment(account);
    }
}
