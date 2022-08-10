package FirstStepsPractical;

import java.util.Scanner;

public class VegetableMarket {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double veggiePrice = Double.parseDouble(scanner.nextLine());
        double fruitPrice =  Double.parseDouble(scanner.nextLine());
        int veggieWeight =Integer.parseInt(scanner.nextLine());
        int fruitWeight = Integer.parseInt(scanner.nextLine());
        double income = veggiePrice*veggieWeight+fruitWeight*fruitPrice;
        double incomeEuro = income/1.94;
        System.out.printf("%.2f",incomeEuro);
    }
}
