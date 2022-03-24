        package com.syntax.class25;

      interface  HealthAble {
          void healthy ();
      }


        public interface Walk extends HealthAble{

        }
        interface Milk extends HealthAble {

            void giveEnergy ();
        }
        interface Banana  extends HealthAble{

            void giveEnergy ();

        }

        class Demo implements Banana {

            @Override
            public void healthy() {
                System.out.println("banana is good for your health ");

            }

            @Override
            public void giveEnergy() {
                System.out.println("it gives you energy");

            }
        }

        // the interfeace can inherid from other interfaces using extends
        // interface --> class use implement
        //interface --> interface use extends