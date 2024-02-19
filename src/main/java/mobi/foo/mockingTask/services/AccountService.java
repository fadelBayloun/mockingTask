package mobi.foo.mockingTask.services;

import mobi.foo.mockingTask.apis.BankClientAPI;
import org.springframework.stereotype.Service;

@Service
public class AccountService {
    private final BankClientAPI bankApi;

    public AccountService(BankClientAPI bankApi) {
        this.bankApi = bankApi;
    }
}
