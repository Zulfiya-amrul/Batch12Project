package com.syntax.class25;

public abstract class SmartWatch {
    // we can have instance variables in abstract class
    private int RAM;
    protected int ROM;
    double displaySize;
    public String make;
    static boolean showTime = true;

    public SmartWatch(int RAM, int ROM, double displaySize, String make) {
        this.RAM = RAM;
        this.ROM = ROM;
        this.displaySize = displaySize;
        this.make = make;
    }


    // 1) access modifier (public)
    // 2) non access modifer (abstract )
    // 3) return type
    // 4) method name

    public abstract void showHealthTips();

    public void updateOS() {
        System.out.println("Update the OS");
    }

    private void checkOSUpdate() {
        System.out.println("Checkeing if update is available");
    }

    private void downloadUpdate() {
        System.out.println("Downloading update if available");
    }
}

    class AppleWatch extends SmartWatch {


        public AppleWatch(int RAM, int ROM, double displaySize, String make) {
            super(RAM, ROM, displaySize, make);
        }

        public static void displayTime() {

                System.out.println("Displaying time");
            }


        @Override
        public void showHealthTips() {
            System.out.println("use the Health App to check the details");

        }
    }




