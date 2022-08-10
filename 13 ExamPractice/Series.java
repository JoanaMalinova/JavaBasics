package ExamPractice;

import java.util.Scanner;

public class Series {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double budget = Double.parseDouble(scanner.nextLine());
        int n = Integer.parseInt(scanner.nextLine());
        double totalPrice = 0;
        for (int i = 1; i <=n ; i++) {
            String seriesName = scanner.nextLine();
            double seriesPrice = Double.parseDouble(scanner.nextLine());
            switch (seriesName){
                case "Thrones":
                    seriesPrice -= 0.5*seriesPrice;
                    totalPrice += seriesPrice;
                    break;
                case "Lucifer":
                    seriesPrice -= 0.4*seriesPrice;
                    totalPrice += seriesPrice;
                    break;
                case "Protector":
                    seriesPrice -= 0.3*seriesPrice;
                    totalPrice += seriesPrice;
                    break;
                case "TotalDrama":
                    seriesPrice -= 0.2*seriesPrice;
                    totalPrice += seriesPrice;
                    break;
                case "Area":
                    seriesPrice -= 0.1*seriesPrice;
                    totalPrice += seriesPrice;
                    break;
                default:
                    totalPrice += seriesPrice;
            }

        }
        double diff = Math.abs(budget - totalPrice);
        if( budget>=totalPrice){

            System.out.printf("You bought all the series and left with %.2f lv.",diff) ;

        }else {

            System.out.printf("You need %.2f lv. more to buy the series!",diff);
        }
    }
}
