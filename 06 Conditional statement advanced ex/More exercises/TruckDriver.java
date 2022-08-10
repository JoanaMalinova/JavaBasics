package ConditionalStAdvPrActice;

import java.util.Scanner;

public class ExtraTruckDriver {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String season = scanner.nextLine();
        double kmPerMonth = Double.parseDouble(scanner.nextLine());
        double totalKm = kmPerMonth*4;
        double pay = 0;
        if(kmPerMonth<=5000){
            switch (season){
                case"Spring":
                case"Autumn":
                    pay = 0.75*totalKm;
                    break;
                case"Summer":
                    pay = 0.9*totalKm;
                    break;
                case"Winter":
                    pay = 1.05*totalKm;
                    break;
            }
        }else if(kmPerMonth<=10000){
            switch (season) {
                case "Spring":
                case "Autumn":
                    pay = 0.95 * totalKm;
                    break;
                case "Summer":
                    pay = 1.1 * totalKm;
                    break;
                case "Winter":
                    pay = 1.25 * totalKm;
                    break;
            }

        }else if (kmPerMonth<=20000) {
                pay= 1.45 *totalKm;

        }
        double finalPay= pay - 0.1*pay;
        System.out.printf("%.2f",finalPay);
    }
}
