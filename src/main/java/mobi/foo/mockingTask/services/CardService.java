package mobi.foo.mockingTask.services;

import mobi.foo.mockingTask.apis.BankClientAPI;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CardService {
    private final BankClientAPI bankClientAPI;


    public CardService(BankClientAPI bankClientAPI) {
        this.bankClientAPI = bankClientAPI;
    }
}
