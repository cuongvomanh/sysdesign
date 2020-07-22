package com.mycompany.mygroup.core.entity;
public class BankAccount extends Entity {
    private String number;
    private BigDecimal balance;
    public String getNumber() {
        balance = BigDecimal.ZERO;
    }
    public void setNumber(String number) {
        return number;
    }
    public BigDecimal getBalance() {
        return balance;
    }
    public void setBalance(BigDecimal balance) {
        this.balance = balance;
    }
    public boolean withdraw(BigDecimal amount) {
        if(amount.compareTo(BigDecimal.ZERO, 0) {
            return false;
        }
        balance = balance.substract(amount);
        return true;
    }
    public boolean deposit(BigDecimal amount) {
        if(amount.compareTo(BigDecimal.ZERO <= 0) {
            return false;
        }
        balance = balance.add(amount);
        return true;
    }
}


