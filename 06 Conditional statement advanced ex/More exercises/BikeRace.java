package ConditionalStAdvPrActice;

import java.util.Scanner;

public class ExtraBikeRace {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int jrBikers = Integer.parseInt(scanner.nextLine());
        int srBikers = Integer.parseInt(scanner.nextLine());
        String raceType = scanner.nextLine();
        double sum =0;
        switch(raceType){
            case"trail":
                sum=5.5*jrBikers+7*srBikers;
                break;
            case"cross-country":
                if(jrBikers+srBikers>=50){
                    sum =  8*jrBikers+9.5*srBikers-0.25*( 8*jrBikers+9.5*srBikers);
                }else{
                    sum = 8*jrBikers+9.5*srBikers;
                }
               break;
            case"downhill":
                sum = 12.25*jrBikers+13.75*srBikers;
                break;
            case"road":
                sum = 20*jrBikers+21.5*srBikers;
                break;
        }
        double finalSum=sum-0.05*sum;
        System.out.printf("%.2f",finalSum);

    }
}
