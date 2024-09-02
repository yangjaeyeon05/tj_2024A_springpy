package example.task1;

import lombok.*;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@ToString
@Builder
public class AccountDto {
    private int accountId;
    private String accountInfo;
    private int accountPrice;
    private String accountDate;
}
