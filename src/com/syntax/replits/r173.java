package com.syntax.replits;

public class r173 {
    public static void main(String[] args) {
        Tea obj1= new LemonTea("lemon");
        obj1.addSugar();

        Tea obj2= new ChaiTea("chiaTea");
        obj2.addSugar();

    }

}
abstract class Tea {

    String teaType;
    Tea (String teaType) {
        this.teaType= teaType;
    }

    abstract void addSugar();

}
    class LemonTea extends Tea {

    LemonTea(String teaType) {
        super(teaType);
    }


    void addSugar() {
        System.out.println ("For Lemon Tea we need 2 spoons of sugar");
    }
}

    class ChaiTea extends Tea {
    ChaiTea(String teaType) {
        super(teaType);
    }

    void addSugar() {
        System.out.println ("For Chai Tea we need 1 spoon of sugar");
    }

}
