package com.company;

public class Hedphones {
    String charge = "Micro usb";
    String[] controls = {"power", "volume", "skip"};
    String color = "rer/black";

    static boolean power = false;
    static int volume = 0;

    public static void powerOn(){
        power = true;
    }
    public static void poweroff(){
        power = false;
    }
    public static void volumeup(){
        volume++;
    }
    public static void volumeDown(){
        volume--;
    }
}
