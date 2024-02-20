package mobi.foo.mockingTask.services;

import mobi.foo.mockingTask.apis.BankClientAPI;
import mobi.foo.mockingTask.models.Account;
import org.springframework.stereotype.Service;

import java.math.BigDecimal;
import java.util.List;

@Service
public class AccountService {
    private BankClientAPI bankAPI;

    public AccountService(BankClientAPI bankApi) {
        this.bankAPI = bankApi;
    }

    public List<Account> getAccounts() {
        return bankAPI.getAccounts();
    }

    public boolean retrieveTransfer(Account sourceAccount, Account destinationAccount, BigDecimal amount) {
        return bankAPI.retrieveTransfer(sourceAccount, destinationAccount,amount);
    }

    public boolean retrieveLoanPayment(Account account, BigDecimal amount) {
        return bankAPI.retrieveLoanPayment(account,amount);
    }
}
