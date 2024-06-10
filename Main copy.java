package com.manogna;

public class Main {
    public static void main(String[] args) {
        Account manognasAccount=new Account("12345",0.0,"manogna","manogna@xyzzz.com","2354326");

        manognasAccount.DepositMoney(100);
        manognasAccount.DepositMoney(150);
        manognasAccount.WithDrawMoney(200);

    }
}
