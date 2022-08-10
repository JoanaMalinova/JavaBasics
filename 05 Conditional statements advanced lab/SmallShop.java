package ConditionalStatementsAdvanced;

import java.util.Scanner;

public class SmallShop {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String productType = scanner.nextLine();;
        String town = scanner.nextLine();
        double productQuantity = Double.parseDouble(scanner.nextLine());
        double productPrice = 0;
        if (town.equals("Sofia")){
            if(productType.equals("coffee")){
                productPrice = 0.5 *productQuantity;
            }else if(productType.equals("water")){
                productPrice = 0.8*productQuantity;
            }else if(productType.equals("beer")){
                productPrice = 1.2*productQuantity;
            }else if(productType.equals("sweets")){
                productPrice =1.45*productQuantity;
            }else if(productType.equals("peanuts")){
                productPrice =1.6*productQuantity;
            }
        }else if(town.equals("Plovdiv")){
            if(productType.equals("coffee")){
                productPrice = 0.4 *productQuantity;
            }else if(productType.equals("water")){
                productPrice = 0.7*productQuantity;
            }else if(productType.equals("beer")){
                productPrice = 1.15*productQuantity;
            }else if(productType.equals("sweets")){
                productPrice =1.3*productQuantity;
            }else if(productType.equals("peanuts")){
                productPrice =1.5*productQuantity;
            }
        }else if(town.equals("Varna")){
            if(productType.equals("coffee")){
                productPrice = 0.45 *productQuantity;
            }else if(productType.equals("water")){
                productPrice = 0.7*productQuantity;
            }else if(productType.equals("beer")){
                productPrice = 1.1*productQuantity;
            }else if(productType.equals("sweets")){
                productPrice =1.35*productQuantity;
            }else if(productType.equals("peanuts")){
                productPrice =1.55*productQuantity;
            }
        }
        System.out.printf("%f",productPrice);
    }
}
