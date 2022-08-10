package CoditionalStPractical;

import java.util.Scanner;

public class FuelTankPart2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String fuelType = scanner.nextLine();
        double fuelQnt = Double.parseDouble(scanner.nextLine());
        String yesNo = scanner.nextLine();;
        if (fuelType.equals("Gasoline")) {
            double gasolinePrice = 2.22 * fuelQnt;
            double priceDiscount = 0;
            double priceDiscount1 = 0;
            if (yesNo.equals("Yes")) {
                double discount = 0.18 * fuelQnt;
                priceDiscount = gasolinePrice - discount;
            } else {
                priceDiscount = gasolinePrice;
            }
            if (fuelQnt > 25) {
                priceDiscount1 = priceDiscount - 0.1 * priceDiscount;

            } else if (fuelQnt > 20) {
                priceDiscount1 = priceDiscount - 0.08 * priceDiscount;
            } else {
                priceDiscount1 = priceDiscount;
            }
            System.out.printf("%.2f lv.", priceDiscount1);

        } else if(fuelType.equals("Diesel")){
            double dieselPrice= 2.33*fuelQnt;
            double priceDiscount=0;
            double priceDiscount1=0;
            if(yesNo.equals("Yes")){
                double discount=0.12*fuelQnt;
                priceDiscount=dieselPrice-discount;
            }else{
                priceDiscount=dieselPrice;
            }
            if (fuelQnt>25){
                priceDiscount1=priceDiscount-0.1*priceDiscount;
            }else if(fuelQnt>20){
                priceDiscount1=priceDiscount-0.08*priceDiscount;
            }else{
                priceDiscount1= priceDiscount;
            }
            System.out.printf("%.2f lv.",priceDiscount1);

        }else if(fuelType.equals("Gas")){
            double gasPrice =0.93*fuelQnt;
            double priceDiscount =0;
            double priceDiscount1=0;
            if(yesNo.equals("Yes")){
                double discount=0.08*fuelQnt;
                priceDiscount=gasPrice-discount;

            }else {
                priceDiscount=gasPrice;
            }
            if(fuelQnt>25){
                priceDiscount1=priceDiscount-0.1*priceDiscount;
            }else if(fuelQnt>20){
                priceDiscount1=priceDiscount-0.08*priceDiscount;
            }else{
                priceDiscount1=priceDiscount;
            }
            System.out.printf("%.2f lv.",priceDiscount1);

        }


    }
}
