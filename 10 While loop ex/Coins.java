package WhileLoopPractice;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Coins {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double sum = Double.parseDouble(scanner.nextLine());
        double rest = 0;
        double cents = 0;
        while (sum>=0.01){

        if (sum >= 2) {
            rest = sum % 2;
           cents =Math.floor(sum / 2);


        } else if (sum >=1) {
            rest = sum % 1;
           cents += 1;

        } else if (sum >=0.50){
            rest = sum % 0.5;
            cents += Math.floor(sum/0.5);


        } else if (sum >=0.20){
            rest = sum % 0.2;
            cents += Math.floor(sum/0.2);


        }else if (sum >=0.10){
            rest = sum % 0.1;
            cents += Math.floor(sum/0.1);

        }else if (sum>= 0.05) {
            rest = sum % 0.05;
            cents += Math.floor(sum/0.05);

        }else if (sum>= 0.02) {
            rest = sum % 0.02;
            cents += Math.floor(sum/0.02);

        }else {
            rest = sum % 0.01;
            cents += Math.floor(sum/0.01);
        }
        sum =Math.round(rest*100.0)  /100.0;

        }
        System.out.printf("%.0f",cents);



    }
}
