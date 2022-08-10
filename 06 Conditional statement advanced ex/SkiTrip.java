package ConditionalStAdvPrActice;

import java.util.Scanner;

public class SkiTrip {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int daysStay = Integer.parseInt(scanner.nextLine());
        String roomType = scanner.nextLine();
        String evaluation = scanner.nextLine();
        double roomPrice = 0;
        double discountPrc =0;
        int nightsStay=daysStay-1;
        switch(roomType){
            case"room for one person":
                roomPrice=18*nightsStay;
                discountPrc=roomPrice;
                break;
            case"apartment":
                roomPrice=25*nightsStay;
                if(daysStay<10){
                    discountPrc=roomPrice- 0.3*roomPrice;
                }else if(daysStay<15){
                    discountPrc=roomPrice-0.35*roomPrice;
                }else{
                    discountPrc =roomPrice-0.5*roomPrice;
                }
                break;

            case"president apartment":
                roomPrice=35*nightsStay;
                if(daysStay<10){
                    discountPrc=roomPrice- 0.1*roomPrice;
                }else if(daysStay<15){
                    discountPrc=roomPrice-0.15*roomPrice;
                }else{
                    discountPrc =roomPrice-0.2*roomPrice;
                }
                break;
        }
        if(evaluation.equals("positive")){
            discountPrc+=0.25*discountPrc;
            System.out.printf("%.2f",discountPrc);
        }else if(evaluation.equals("negative")){
            discountPrc-=0.1*discountPrc;
            System.out.printf("%.2f",discountPrc);
        }

    }
}
