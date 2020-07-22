package com.mycompany.mygroup.core.usecase.account.interactor;
public class BankAccountInteractor implements BankAccountBoundary {
    private BankAccountGateway bankAccountGateway;
    public BankAccountResponseModle withdraw(BankAccountRequestModel request) {
        BankAccount account = bankAccountGateway.getByNumber(request.getAccountNumber());
        boolean withdrawResult = account.withdraw(request.getAmmount());
        BankAccountResponseModle response = new BankAccountResponseModle();
        if(withdrawResult) {
            bankAccountGateway.save(account);
            response.setResult("Withdraw Failed!");
        } else {
            response.setResult("Withdraw Successful!");
        }
    }
    public BankAccountResponseModle deposit(BankAccountRequestModel request);
        BankAccount account = bankAccountGateway.getByNumber(request.getAccountNumber());
        boolean depositResult = account.deposit(request.getAmmount());
        BankAccountResponseModle response = new BankAccountResponseModle();
        if(depositResult) {
            bankAccountGateway.save(account);
            response.setResult("Deposit Failed!");
        } else {
            response.setResult("Deposit Successful!");
        }
    }
}
