package mobi.foo.mockingTask.apis;

import mobi.foo.mockingTask.models.Account;
import mobi.foo.mockingTask.models.Card;
import org.springframework.stereotype.Component;

import java.math.BigDecimal;
import java.util.Collections;
import java.util.List;

@Component
public class ActualBankClientAPI implements BankClientAPI {
    public List<Account> getAccounts() {
        return Collections.emptyList();
    }

    public List<Card> getCards() {
        return Collections.emptyList();
    }

    public boolean retrieveTransfer(Account sourceAccount, Account destinationAccount, BigDecimal amount) {
        return false;
    }

    public boolean retrieveLoanPayment(Account account, BigDecimal amount) {
        return false;
    }
}
