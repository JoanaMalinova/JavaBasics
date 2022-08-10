package ForLoopPr;

import java.util.Scanner;

public class Logistics {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int cargoNum = Integer.parseInt(scanner.nextLine());
        double price = 0;
        int cargoTon1=0;
        int cargoTon2=0;
        int cargoTon3= 0;
        for(int i =1;i<=cargoNum;i++){
            int cargoTon = Integer.parseInt(scanner.nextLine());
            if(cargoTon<=3){
                price+=200*cargoTon;
                 cargoTon1+=cargoTon;

            }else if(cargoTon<=11){
                 cargoTon2+=cargoTon;

               price+=175*cargoTon;

            }else {
                price+=120*cargoTon;
                cargoTon3+=cargoTon;
            }
        }
        int totalTon = cargoTon1+cargoTon2+cargoTon3;
        double averagePrice = price/totalTon;
        double ton1Percent  = cargoTon1*100.0/totalTon;
        double ton2Percent  = cargoTon2*100.0/totalTon;
        double ton3Percent  = cargoTon3*100.0/totalTon;
        System.out.printf("%.2f%n",averagePrice);
        System.out.printf("%.2f%%%n",ton1Percent);
        System.out.printf("%.2f%%%n",ton2Percent);
        System.out.printf("%.2f%%%n",ton3Percent);


    }
}
