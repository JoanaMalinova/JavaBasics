package ConditionalStAdvPrActice;

import java.util.Scanner;

public class ExtraFlowers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int chrysanthemum = Integer.parseInt(scanner.nextLine());
        int roses = Integer.parseInt(scanner.nextLine());
        int tulips = Integer.parseInt(scanner.nextLine());
        String season = scanner.nextLine();
        String holidayYesNo = scanner.nextLine();
        double bouquetPrice=0;
        int bouquet = chrysanthemum+roses+tulips;
        switch (season){
            case "Spring":
            case "Summer":
                bouquetPrice = 2*chrysanthemum+4.1*roses+2.5*tulips;
                break;
            case"Autumn":
            case"Winter":
                bouquetPrice = 3.75*chrysanthemum+4.5*roses+4.15*tulips;
                break;
        }
        if(holidayYesNo.equals("Y")){
            bouquetPrice+=bouquetPrice*0.15;
        }
        if(season.equals("Spring")&& tulips>7 ){
            bouquetPrice-=bouquetPrice*0.05;
        }else if(season.equals("Winter")&&roses>=10){
            bouquetPrice-=bouquetPrice*0.1;
        }
        if(bouquet>20){
            bouquetPrice-=bouquetPrice*0.2;
        }
        double totaPrice = bouquetPrice+2;
        System.out.printf("%.2f",totaPrice);

    }
}
