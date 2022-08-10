package ConditionalStatementsAdvanced;

import java.util.Scanner;

public class TradeCommissions {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String town = scanner.nextLine();
        double sales  = Double.parseDouble(scanner.nextLine());
        double commissionPrice = 0;
        if(town.equals("Sofia") && sales>=0 && sales<=500){
            commissionPrice= 0.05 * sales;
            System.out.printf("%.2f",commissionPrice);
        }else if(town.equals("Sofia")&& sales>500 && sales <=1000){
            commissionPrice=0.07 *sales;
            System.out.printf("%.2f",commissionPrice);
        }else if(town.equals("Sofia")&& sales>1000 && sales <=10000){
            commissionPrice =0.08*sales;
            System.out.printf("%.2f",commissionPrice);
        }else if(town.equals("Sofia")&& sales >10000){
            commissionPrice =0.12*sales;
            System.out.printf("%.2f",commissionPrice);
        }else if(town.equals("Varna")&& sales>=0 && sales<=500){
            commissionPrice= 0.045 * sales;
            System.out.printf("%.2f",commissionPrice);
        }else if(town.equals("Varna")&& sales>500 && sales <=1000){
            commissionPrice=0.075 *sales;
            System.out.printf("%.2f",commissionPrice);
        }else if(town.equals("Varna")&& sales>1000 && sales <=10000){
            commissionPrice =0.1*sales;
            System.out.printf("%.2f",commissionPrice);
        }else if(town.equals("Varna")&& sales >10000){
            commissionPrice =0.13*sales;
            System.out.printf("%.2f",commissionPrice);
        }else if(town.equals("Plovdiv")&& sales>=0 && sales<=500){
            commissionPrice= 0.055 * sales;
            System.out.printf("%.2f",commissionPrice);
        }else if(town.equals("Plovdiv")&& sales>500 && sales <=1000){
            commissionPrice=0.08 *sales;
            System.out.printf("%.2f",commissionPrice);
        }else if(town.equals("Plovdiv")&& sales>1000 && sales <=10000){
            commissionPrice =0.12*sales;
            System.out.printf("%.2f",commissionPrice);
        }else if(town.equals("Plovdiv")&& sales >10000){
            commissionPrice =0.145*sales;
            System.out.printf("%.2f",commissionPrice);
        } else {
            System.out.println("error");
        }

    }
}
