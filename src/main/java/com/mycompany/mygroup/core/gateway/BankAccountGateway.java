package com.mycompany.mygroup.core.gateway;

import com.mycompany.mygroup.core.entity.BankAccount;

public interface BankAccountGateway extends EntityGateway {
    public BankAccount getByNumber(String number);
    public void save(BankAccount entity);
}
