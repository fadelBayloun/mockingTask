package mobi.foo.mockingTask.models;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class Card {
    private Long id;
    private String cardNumber;
    private String cardType;
}
