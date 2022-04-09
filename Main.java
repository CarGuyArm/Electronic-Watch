package com.company;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Input seconds: ");
        int seconds = scanner.nextInt();
        int hours = 0,minutes = 0;

        minutes = seconds/60;
        seconds -= minutes * 60;

        hours = minutes/60;
        minutes -= hours*60;
/*
        second = seconds % 60; //
        minutes = (seconds/60)%60; // 1 ropen = 60 vrk
        hours = (seconds/60)/60; // 1 jam = 3600 vrk
*/
        System.out.println("Seconds converted to HH : MM : SS format.");
        if (hours > 23)
            hours = 0;
        String printSec = (seconds<10)?"0"+Integer.toString(seconds):Integer.toString(seconds);
        String printMin = (minutes<10)?"0"+Integer.toString(minutes):Integer.toString(minutes);
        String printHour =  Integer.toString(hours);
        System.out.println(printHour+":"+printMin+":"+printSec);
        System.out.println("Thanks for using our app!");
    }
}
