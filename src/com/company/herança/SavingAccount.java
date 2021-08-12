package com.company.herança;

public class SavingAccount extends Account {

    private Double interestRate;

    public SavingAccount() {
        super();
    }

    public SavingAccount(String holder, Integer number, Double balance, Double interestRate) {
        super(holder, number, balance);
        this.interestRate = interestRate;
    }

    public Double getInterestRate() {
        return interestRate;
    }

    public void setInterestRate(Double interestRate) {
        this.interestRate = interestRate;
    }

    public void updateBalance(){
        balance += balance * interestRate;
    }
}
