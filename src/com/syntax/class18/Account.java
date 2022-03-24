package com.syntax.class18;

public class Account {

        private String userName;
        private String password;
        public String accountNUmber= "12345";
        private double balance =1500;

        private void printUserName () {

            System.out.println(userName);
        }

        protected void printPassword (){

            System.out.println(password);
        }

        void printBalance () {

            System.out.println(balance);
        }

        public void printAccountNumber () {

            System.out.println(accountNUmber);
        }


    public static void main(String[] args) {

            Account account = new Account();
            account.printAccountNumber();
            account.printUserName();
            account.printBalance();
            account.printPassword();

       // System.out.println(userName);
       // System.out.println(password);
       // System.out.println(balance);
      //  System.out.println(accountNUmber);



    }
}
