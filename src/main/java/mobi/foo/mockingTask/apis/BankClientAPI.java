package mobi.foo.mockingTask.apis;

import mobi.foo.mockingTask.models.Account;
import mobi.foo.mockingTask.models.Card;

import java.util.List;

public interface BankClientAPI {
    List<Account> getAccounts();
    List<Card> getCards();
}
