package ExamProgramingBasics;

import java.util.Scanner;

public class ComputerFirm {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int computerCount = Integer.parseInt(scanner.nextLine());
        double finalSales = 0;
        double totalSales = 0;
        double totalRating = 0;
        int counter = 0;

        for (int i = 0; i < computerCount; i++) {
            double salesDone = 0;
            String ratingSales = scanner.nextLine();
            char rating = ratingSales.charAt(ratingSales.length()-1);
            String rating1 = ""+ rating;
            int rating2 = Integer.parseInt(rating1);
           int sales = Integer.parseInt(ratingSales);

           finalSales = (sales - rating2) / 10.0;

           switch (rating) {
                case '2':
                    salesDone = 0;
                    break;
                case '3':
                    salesDone = 0.5 * finalSales;
                    break;
                case'4':
                    salesDone = 0.7 * finalSales;
                    break;
                case'5':
                    salesDone = 0.85 * finalSales;
                    break;
                case '6':
                    salesDone = finalSales;
                    break;
            }
            totalSales += salesDone;
           totalRating += rating2;
           counter ++;


        }
        System.out.printf("%.2f%n",totalSales);
        System.out.printf("%.2f",totalRating / counter);
    }
}
