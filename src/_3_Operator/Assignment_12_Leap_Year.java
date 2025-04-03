package _3_Operator;

import java.util.Scanner;

public class Assignment_12_Leap_Year {
    public static void main(String[] args) {
        Scanner rk = new Scanner(System.in);
        System.out.println("Enter Year :  ");
        int year = rk.nextInt();

        if((year % 4 == 0  && year % 100 !=0) || (year % 400 == 0)){
            System.out.println("Leap year");
        }
        else{
            System.out.println("Not leap year");
        }

    }
}
