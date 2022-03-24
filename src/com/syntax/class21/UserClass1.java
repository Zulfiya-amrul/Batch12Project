package com.syntax.class21;
// parent class
public class UserClass1 {
    /*Write program: userClass  that has a constructor that initializes instance variable name and mobile number.
     Create a subclass  userInfo that will have user address variable
      and it also being initialized through constructor call.
      Print users name, mobile number and address in userDetails method. Test your code.
     */
    String name;
    String mobileNum;
    // constructor for parent class
    UserClass1 (String name, String mobileNum) {
        this.name= name;
        this.mobileNum= mobileNum;
    }
}
// child class
class UserInfo1 extends UserClass1 {
    String userAddress;
    // constructor for child class
    UserInfo1 (String name, String mobileNum, String userAddress) {
        super(name, mobileNum);
        this.userAddress = userAddress;
    }
    // method
    void userDetails () {
        System.out.println(name+ " " + mobileNum + " " + userAddress);
    }
}
class test1 {
    public static void main(String[] args) {

        UserInfo obj = new UserInfo("Zulfiya", " 1234567", "address44444");
        obj.userDetails();
    }
}

