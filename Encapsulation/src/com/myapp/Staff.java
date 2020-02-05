package com.myapp;

public class Staff {

            public String name;
            public String address;
            public int age;



    public void getPrint() {
        System.out.println("Your Name is\t"+name+"\nYour Address is\t"+address+"\nYour Age is\t"+age);

    }
    Bank bank=new Bank();
    public void setBankAccount(String accountnumber,int balance) {

        bank.setAccountnumber(accountnumber);
        bank.setBalance(balance);
    }
    public void getOuterBankPrint() {

        System.out.println("Your Account Number is\t"+bank.getAccountnumber()+"\nYour Balance is\t"+bank.getBalance());

    }



    private class Bank{
                private String accountnumber;
                private int balance;

                public String getAccountnumber() {
                    return accountnumber;
                }

                public void setAccountnumber(String accountnumber) {
                    this.accountnumber = accountnumber;
                }

                public int getBalance() {
                    return balance;
                }

                public void setBalance(int balance) {
                    this.balance = balance;
                }

                public void getBankPrint() {
                    System.out.println("Your Account Number is\t"+accountnumber+"\nYour Balance is\t"+balance);

                }
            }
}
