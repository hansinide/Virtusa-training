package com.myapp;

public class Lecturers {

    public String name;
    public String address;
    public int age;


    public void getPrint() {
        System.out.println("Your Name is\t"+name+"\nYour Address is\t"+address+"\nYour Age is\t"+age);

    }




    Staff staffO=new Staff() {



        public void getPrint() {
            System.out.println("Your Name is\t"+name+"\nYour Address is\t"+address+"\nYour Age is\t"+age);

        }

        public void getOuterBankPrint() {

            System.out.println("Your Account Number is\t"+getAccountnumber()+"\nYour Balance is\t"+getBalance());

        }

    };


    public void getOuterBankPrint() {

        System.out.println("Your Account Number is\t"+staffO.getAccountnumber()+"\nYour Balance is\t"+staffO.getBalance());

    }
    public void setBankAccount(String accountnumber,int balance) {

        staffO.setAccountnumber(accountnumber);
        staffO.setBalance(balance);
    }


  private   class Staff {

        public String name;
        public String address;
        public int age;
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

      public void getPrint() {
            System.out.println("Your Name is\t"+name+"\nYour Address is\t"+address+"\nYour Age is\t"+age);

        }

        public void getOuterBankPrint() {

            System.out.println("Your Account Number is\t"+accountnumber+"\nYour Balance is\t"+balance);

        }

    }

}
