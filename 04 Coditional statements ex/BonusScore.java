package CoditionalStPractical;

import java.util.Scanner;

public class BonusScore {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double number = Double.parseDouble(scanner.nextLine());
        double bonus = 0.0;

        if (number <= 100) {
            bonus = 5;

        } else if (number <= 1000) {
            bonus = 0.2 * number ;
        } else{
            bonus = 0.1 * number ;
        }

        if (number%2==0) {
            bonus = 1 + bonus;
        }else if (number%10==5){
            bonus=bonus+2;}

            System.out.println(bonus);;
            System.out.println(bonus+number);

        }


    }



