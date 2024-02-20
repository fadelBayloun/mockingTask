package mobi.foo.mockingTask.serviceTests;

import mobi.foo.mockingTask.apis.BankClientAPI;
import mobi.foo.mockingTask.models.Card;
import mobi.foo.mockingTask.services.CardService;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.when;

@ExtendWith(MockitoExtension.class)
public class CardServiceTest {

    @Mock
    BankClientAPI bankAPI;

    @InjectMocks
    CardService service;


    @Test
    public void testGetCards() {
        List<Card> expectedCards = new ArrayList<>();
        expectedCards.add(new Card(1L, "1234567890123456", "VISA"));
        expectedCards.add(new Card(2L, "9876543210987654", "MasterCard"));

        when(bankAPI.getCards()).thenReturn(expectedCards);

        List<Card> actualCards = service.getCards();

        assertEquals(expectedCards, actualCards);

    }
}
