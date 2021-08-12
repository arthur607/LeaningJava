package com.company.herança;

public class BussinesAccount  extends Account{
    private Double loanLimit;

    public  BussinesAccount(){
        super();   //searching logic of empty constructor from basic class
    }

    public BussinesAccount(String holder, Integer number, Double balance, Double loanLimit) {
        super(holder, number, balance);
        this.loanLimit = loanLimit;
    }

    public void  loan(double amount){
        if (amount <= loanLimit) {
           balance += amount - 10.0;
        }


    }

    public Double getLoanLimit() {
        return loanLimit;
    }

    public void setLoanLimit(Double loanLimit) {
        this.loanLimit = loanLimit;
    }
}
