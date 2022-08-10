package CoditionalStPractical;

import java.util.Scanner;

public class ExtraTransportPrice {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int km = Integer.parseInt(scanner.nextLine());
        String timeOfDay = scanner.nextLine();
        double taxiFair = 0;
        double busFair= 0.09;
        double trainFair = 0.06;

        if(timeOfDay.equals("day")) {
            taxiFair=0.79;

        }else if(timeOfDay.equals("night")) {
            taxiFair = 0.90;
        }
        double taxiPay = taxiFair*km;
        double busPay = busFair*km;
        double trainPay = trainFair*km;
        if(km<20){
            double taxiTotal=0.7+taxiPay;
            System.out.printf("%.2f",taxiTotal);
        }else if(km<100){
            System.out.printf("%.2f",busPay);
        }else{
            System.out.printf("%.2f",trainPay);
        }




    }
}
