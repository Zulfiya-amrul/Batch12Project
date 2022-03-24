package com.syntax.class20;

public class ChemistryTeacher extends taskTeacher {

   void OChem () {
       System.out.println(name + " teaching organic chemistry");
   }

    public static void main(String[] args) {
        taskTeacher science = new taskTeacher();
        science.name = "helen";
        science.classroomNum= 9090;
        science.teacherID= "OP23954";
        science.printInfo();

       //science.OChem();


    }
}
