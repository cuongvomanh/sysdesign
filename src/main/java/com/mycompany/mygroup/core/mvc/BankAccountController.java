package com.mycompany.mygroup.core.mvc;

import com.mycompany.mygroup.core.infra.di.DependencyResolver;
import com.mycompany.mygroup.core.mvc.IBankAccountController;
import com.mycompany.mygroup.core.usecase.account.BankAccountBoundary;

import java.math.BigDecimal;

public class BankAccountController implements IBankAccountController {
    private BankAccountBoundary bankAccountBoundary;
//    public BankAccountController() {
//        this.bankAccountBoundary = DependencyResolver.getBankAccountBoundary();
//    }

    public void deposit(String accountNumber, BigDecimal amount) {

    }

    public void withdraw(String accountNumber, BigDecimal amount) {

    }
}
