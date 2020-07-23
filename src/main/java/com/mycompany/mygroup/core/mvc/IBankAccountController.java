package com.mycompany.mygroup.core.mvc;

import java.math.BigDecimal;

public interface IBankAccountController {
    public void withdraw(String accountNumber, BigDecimal amount);
    public void deposit(String accountNumber, BigDecimal amount);
}
