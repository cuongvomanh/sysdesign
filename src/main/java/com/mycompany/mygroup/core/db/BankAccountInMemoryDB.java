package com.mycompany.mygroup.core.db;

import com.mycompany.mygroup.core.entity.BankAccount;
import com.mycompany.mygroup.core.gateway.BankAccountGateway;

import java.math.BigDecimal;
import java.util.HashMap;
import java.util.Map;

public class BankAccountInMemoryDB implements BankAccountGateway {
    private static Map accountDB = new HashMap();

    static {
        {
            BankAccount account = new BankAccount();
            account.setId(1);
            account.setNumber("001");
            account.setBalance(BigDecimal.valueOf(100000));
            accountDB.put(1, account);
        }
        {
            BankAccount account = new BankAccount();
            account.setId(2);
            account.setNumber("002");
            account.setBalance(BigDecimal.valueOf(500000));
            accountDB.put(2, account);
        }
        {
            BankAccount account = new BankAccount();
            account.setId(3);
            account.setNumber("003");
            account.setBalance(BigDecimal.valueOf(700000));
            accountDB.put(3, account);
        }

    }

    public BankAccount getByNumber(String number) {
        return null;
    }

    public void save(BankAccount entity) {
        System.out.println("Save BankAccount");
        accountDB.put(entity.getId(), entity);
    }

    public BankAccount getById(int id) {
        return null;
    }


}