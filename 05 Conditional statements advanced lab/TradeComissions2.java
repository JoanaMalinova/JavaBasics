package ConditionalStatementsAdvanced;

import java.util.Scanner;

public class TradeComissions2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String town = scanner.nextLine();
        double sales  = Double.parseDouble(scanner.nextLine());
        double commissionPrice = 0;
        boolean isInvalid = false;
        switch (town){
            case "Sofia":
                if(sales>=0&&sales<=500){
                    commissionPrice=0.05*sales;
                }else if(sales>500&&sales<=1000){
                    commissionPrice=0.07*sales;

                }else if(sales>1000&&sales<=10000){
                    commissionPrice=0.08*sales;

                }else if(sales>10000){
                    commissionPrice=0.12*sales;
                }else{
                    isInvalid=true;
                }
                break;
            case"Varna":
                if(sales>=0&&sales<=500){
                    commissionPrice=0.045*sales;
                }else if(sales>500&&sales<=1000){
                    commissionPrice=0.075*sales;

                }else if(sales>1000&&sales<=10000){
                    commissionPrice=0.1*sales;

                }else if(sales>10000){
                    commissionPrice=0.13*sales;
                }else{
                    isInvalid=true;
                }
                    break;
            case "Plovdiv":
                if(sales>=0&&sales<=500){
                    commissionPrice=0.055*sales;
                }else if(sales>500&&sales<=1000){
                    commissionPrice=0.08*sales;

                }else if(sales>1000&&sales<=10000){
                    commissionPrice=0.12*sales;

                }else if(sales>10000){
                    commissionPrice=0.145*sales;
                }else{
                    isInvalid=true;
                }
                break;
            default:
                isInvalid =true;

                break;
        }if(!isInvalid){
            System.out.printf("%.2f",commissionPrice);
        }else
            System.out.println("error");
        }

}
