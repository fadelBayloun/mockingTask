package mobi.foo.mockingTask.serviceTests;

import mobi.foo.mockingTask.apis.BankClientAPI;
import mobi.foo.mockingTask.services.CardService;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

@ExtendWith(MockitoExtension.class)
public class CardServiceTest {

    @Mock
    BankClientAPI bankAPI;

    @InjectMocks
    CardService service;
}
