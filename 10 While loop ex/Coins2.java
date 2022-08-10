package WhileLoopPractice;

import java.util.Scanner;

public class Coins2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double sum = Double.parseDouble(scanner.nextLine());
        double rest = 0;
        double coins = 0;
        while(sum>=0.01){
            if (sum >= 2) {
                rest = sum % 2;
                coins =Math.floor(sum / 2);
            }else if (sum >=1){
                rest = sum - 1;
                coins ++;

            }else if (sum>=0.5){
                rest = sum - 0.5;
                coins++;

            }else if (sum>=0.2){
                if(sum>=0.4){
                    rest = sum-0.4;
                    coins += 2;
                }else{
                    rest = sum-0.2;
                    coins ++;
                }

            }else if (sum>=0.1){
                rest = sum - 0.1;
                coins++;

            }else if (sum>=0.05){
                rest = sum - 0.05;
                coins++;

            }else if (sum>=0.02){
                if(sum==0.04){
                    rest = sum - 0.04;
                    coins += 2;
                }else {
                    rest = sum - 0.02;
                    coins ++;
                }

            }else {
                rest =sum - 0.01;
                coins++;

            }
            sum = rest;

        }
        System.out.printf("%.0f",coins);
    }
}
