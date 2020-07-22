
package com.mycompany.mygroup.core.usecase.account;
public interface BankAccountBoundary {
    public BankAccountWithdrawResponseModle withdraw(BankAccountWithdrawRequestModel request);
    public BankAccountDepositResponseModle withdraw(BankAccountDepositRequestModel request);
}

