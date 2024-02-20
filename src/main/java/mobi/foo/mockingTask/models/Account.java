package mobi.foo.mockingTask.models;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class Account {
    private Long id;
    private String accountNumber;
    private BigDecimal balance;
}
