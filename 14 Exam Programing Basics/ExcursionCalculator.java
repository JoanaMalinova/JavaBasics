package ExamProgramingBasics;

import java.util.Scanner;

public class ExcursionCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int people = Integer.parseInt(scanner.nextLine());
        String season = scanner.nextLine();
        double initialPrice = 0;
        double price = 0;
        switch (season) {
            case "spring" :
                if(people <= 5){
                    price = 50 * people;

                } else {
                    price = 48 * people;

                }
                break;
            case "summer":
                if(people <= 5){
                    initialPrice = 48.5 * people;
                    price = initialPrice - 15 * initialPrice / 100;

                } else {
                    initialPrice = 45 * people;
                    price = initialPrice -15 * initialPrice / 100;

                }
                break;
            case "autumn":
                if(people <= 5){
                    price = 60 * people;

                } else {
                    price = 49.5 * people;

                }
                break;
            case "winter":
                if(people <= 5){
                    initialPrice = 86 * people;
                    price = initialPrice + 8 * initialPrice / 100;

                } else {
                    initialPrice = 85 * people;
                    price = initialPrice +8 * initialPrice / 100;

                }
                break;
        }
        System.out.printf("%.2f leva.",price);

    }
}
