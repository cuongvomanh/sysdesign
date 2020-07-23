package com.mycompany.mygroup.core.usecase.account.interactor;

import com.mycompany.mygroup.core.entity.BankAccount;
import com.mycompany.mygroup.core.gateway.BankAccountGateway;
import com.mycompany.mygroup.core.usecase.RequestModel;
import com.mycompany.mygroup.core.usecase.ResponseModel;
import com.mycompany.mygroup.core.usecase.account.BankAccountBoundary;

public class BankAccountInteractor implements BankAccountBoundary {
    private BankAccountGateway bankAccountGateway;
    public ResponseModel withdraw(RequestModel request) {
        BankAccount account = bankAccountGateway.getByNumber(request.getAccountNumber());
        boolean withdrawResult = account.withdraw(request.getAmmount());
        ResponseModel response = new ResponseModel();
        if(withdrawResult) {
            bankAccountGateway.save(account);
            response.setResult("Withdraw Failed!");
        } else {
            response.setResult("Withdraw Successful!");
        }
        return null;
    }
    public ResponseModel deposit(RequestModel request){
        BankAccount account = bankAccountGateway.getByNumber(request.getAccountNumber());
        boolean depositResult = account.deposit(request.getAmmount());
        ResponseModel response = new ResponseModel();
        if(depositResult) {
            bankAccountGateway.save(account);
            response.setResult("Deposit Failed!");
        } else {
            response.setResult("Deposit Successful!");
        }
        return response;
    }
}
