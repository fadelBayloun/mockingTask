package mobi.foo.mockingTask.serviceTests;

import mobi.foo.mockingTask.apis.BankClientAPI;
import mobi.foo.mockingTask.models.Account;
import mobi.foo.mockingTask.services.AccountService;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import org.mockito.junit.jupiter.MockitoExtension;
import org.springframework.boot.test.context.SpringBootTest;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.Mockito.*;

@ExtendWith(MockitoExtension.class)
public class AccountServiceTest {
    @Mock
    BankClientAPI bankAPI;

    @InjectMocks
    AccountService service;

    @BeforeEach
    public void setUp() {
        MockitoAnnotations.initMocks(this);
    }


    @Test
    public void testGetAccounts() {
        List<Account> expectedAccounts = new ArrayList<>();
        expectedAccounts.add(new Account(1L, "1234567890", new BigDecimal("1000.00")));
        expectedAccounts.add(new Account(2L, "0987654321", new BigDecimal("500.00")));
        when(bankAPI.getAccounts()).thenReturn(expectedAccounts);

        List<Account> actualAccounts = service.getAccounts();

        assertEquals(expectedAccounts, actualAccounts);
    }
    @Test
    public void testRetrieveTransfer() {
        Account sourceAccount = new Account(1L,"1234567890",new BigDecimal("1000.00"));
        Account destinationAccount = new Account(2L,"0987654321",new BigDecimal("500.00"));
        BigDecimal amount = new BigDecimal("100.00");

        when(bankAPI.retrieveTransfer(sourceAccount, destinationAccount, amount)).thenReturn(true);

        boolean transferResult = service.retrieveTransfer(sourceAccount, destinationAccount, amount);

        assertTrue(transferResult);
        verify(bankAPI).retrieveTransfer(sourceAccount, destinationAccount, amount);
    }

    @Test
    public void testRetrieveLoanPayment() {
        Account account = new Account(1L,"1234567890",new BigDecimal("100.00"));

        BigDecimal amount = new BigDecimal("100.00");

        when(bankAPI.retrieveLoanPayment(account, amount)).thenReturn(true);

        boolean paymentResult = service.retrieveLoanPayment(account, amount);

        assertTrue(paymentResult);

        verify(bankAPI).retrieveLoanPayment(account, amount);
    }


}
