package mobi.foo.mockingTask.apis;

import mobi.foo.mockingTask.models.Account;
import mobi.foo.mockingTask.models.Card;
import org.springframework.stereotype.Component;

import java.util.List;


public interface BankClientAPI {
    List<Account> getAccounts();
    List<Card> getCards();

    boolean retrieveTransfer(Account sourceAccount,Account destinationAccount);

    boolean retrieveLoanPayment(Account account);
}
