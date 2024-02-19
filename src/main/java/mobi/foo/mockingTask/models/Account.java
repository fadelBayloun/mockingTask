package mobi.foo.mockingTask.models;

import lombok.Data;

import java.math.BigDecimal;

@Data
public class Account {
    private Long id;
    private String accountNumber;
    private BigDecimal balance;
}
