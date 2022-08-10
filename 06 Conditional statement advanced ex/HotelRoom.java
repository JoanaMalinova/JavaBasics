package ConditionalStAdvPrActice;

import java.util.Scanner;

public class HotelRoom {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String month = scanner.nextLine();
        int nights = Integer.parseInt(scanner.nextLine());
        double aptPrice =0;
        double studioPrice =0;
        switch (month){
            case "May":
            case "October":
                aptPrice=65*nights;
                studioPrice=50*nights;
                if(nights>14){
                    studioPrice-=0.3*studioPrice;
                    aptPrice -= 0.1*aptPrice;
                }else if(nights>7){
                    studioPrice-=0.05*studioPrice;
                }
                break;
            case "June":
            case"September":
                studioPrice=75.2*nights;
                aptPrice=68.7*nights;
                if(nights>14){
                    studioPrice-=0.2*studioPrice;
                    aptPrice-=0.1*aptPrice;
                }
                break;
            case"July":
            case"August":
                aptPrice=77*nights;
                studioPrice=76*nights;
                if(nights>14){
                    aptPrice-=0.1*aptPrice;
                }
                break;
        }
        System.out.printf("Apartment: %.2f lv.",aptPrice);
        System.out.println();
        System.out.printf("Studio: %.2f lv.",studioPrice);

    }
}
