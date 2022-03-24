package com.syntax.youtubeVIdeos;
class Main12 {
    public static void main (String []args) {
        Person obj = new Person ("John", "Doe", 110, 25, 1900,"123-45-6789" );
        //String firstName, String lastName, int birthMoth, int birthDay, int birthYear, String ssn )
        System.out.println(obj.getFirstName());
        System.out.println(obj.getLastName());
        System.out.println(obj.formatBirthday());
        System.out.println(obj.getSsn());

    }
}
class Person {
    private String firstName;
    private String lastName;
    private int birthMonth;
    private int birthDay;
    private int birthYear;
    private String ssn;

    Person (String firstName, String lastName, int birthMonth, int birthDay, int birthYear, String ssn ) {
        this.firstName=firstName;
        this.lastName=lastName;
        this.birthMonth = birthMonth;
        this.birthDay=birthDay;
        this.birthYear=birthYear;
        this.ssn=ssn;
    }

    // getter firstName
    public String getFirstName (){
        return firstName;
    }
    // getter lastName
    public String getLastName (){
        return lastName;
    }
    // getter birthMonth
    public int getBirthMonth () {
        return birthMonth;
    }
    //getter birthDay
    public int getBirthDay (){
        return birthDay;
    }
    //getter birthYear
    public int getBirthYear (){
        return birthYear;
    }
    // getter ssn
    public String getSsn (){
        return ssn;
    }
    public String formatBirthday () {
        return (birthMonth + "/"+ birthDay +"/"+ birthYear);
    }

}