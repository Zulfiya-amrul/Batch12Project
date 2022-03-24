package com.syntax.class20;

import com.sun.xml.internal.ws.api.model.wsdl.WSDLOutput;

public class Lion extends Animal{

    boolean huntOthers =true;

   void roar () {
       System.out.println(name + " is roaring");
   }

    public static void main(String[] args) {
        Lion lion= new Lion ();
        lion.name= "Alex";
        lion.sleep();
        lion.roar();

  }

}
