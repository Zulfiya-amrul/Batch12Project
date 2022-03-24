package com.syntax.class20;

public class PianoTeacher extends taskTeacher {
    String instrument;

    void play () {
        System.out.println("playing piano");
    }


    public static void main(String[] args) {

        taskTeacher music = new taskTeacher();
        music.name = "Janet";
        music.classroomNum= 5566;
        music.teacherID= "QA1234";
        music.printInfo();
        //music.play ();


    }
}
