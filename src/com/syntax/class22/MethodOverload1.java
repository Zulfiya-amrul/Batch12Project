package com.syntax.class22;

        public class MethodOverload1 {
            public static void main(String[] args) {

                add(10);
                add(20,30);
                add(30,40,50);
                add (10, 20, 30, 50);

            }
           /* static void  add(int num1, int num2){
                System.out.println(num1+num2);
            }
           static void  add(int num1, int num2, int num3){
               System.out.println(num1+num2+num3);
               }
            */

            //variable arguments
            static void  add(int...numArray){// we don't know how many parameters ... - syntax
                int sum=0;
                for(int num:numArray){
                    sum=sum+num;
                }
                System.out.println(sum);
            }}

