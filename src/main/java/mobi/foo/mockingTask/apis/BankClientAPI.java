package mobi.foo.mockingTask.apis;

import mobi.foo.mockingTask.models.Account;
import mobi.foo.mockingTask.models.Card;

import java.math.BigDecimal;
import java.util.List;


public interface BankClientAPI {
    List<Account> getAccounts();
    List<Card> getCards();

    boolean retrieveTransfer(Account sourceAccount,Account destinationAccount, BigDecimal amount);

    boolean retrieveLoanPayment(Account account, BigDecimal amount);
}
