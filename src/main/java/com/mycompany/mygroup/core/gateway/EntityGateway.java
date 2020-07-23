package com.mycompany.mygroup.core.gateway;

import com.mycompany.mygroup.core.entity.BankAccount;

public interface EntityGateway {
    public void save(BankAccount entity);
    public BankAccount getById(int id);
}
