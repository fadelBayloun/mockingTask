package mobi.foo.mockingTask.services;

import mobi.foo.mockingTask.apis.BankClientAPI;
import mobi.foo.mockingTask.models.Card;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CardService {
    private final BankClientAPI bankAPI;


    public CardService(BankClientAPI bankClientAPI) {
        this.bankAPI = bankClientAPI;
    }

    public List<Card> getCards() {
        return bankAPI.getCards();
    }
}
