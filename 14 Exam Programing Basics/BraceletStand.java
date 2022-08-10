package ExamProgramingBasics;

import java.util.Scanner;

public class BraceletStand {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double pocketMoneyPerDay = Double.parseDouble(scanner.nextLine());
        double profitPerDay = Double.parseDouble(scanner.nextLine());
        double expenses = Double.parseDouble(scanner.nextLine());
        double giftPrice = Double.parseDouble(scanner.nextLine());
        double totalPocketMoney = pocketMoneyPerDay * 5;
        double totalProfit = profitPerDay * 5;
        double totalMoney = totalPocketMoney + totalProfit -expenses;

        if( totalMoney >= giftPrice ) {

            System.out.printf("Profit: %.2f BGN, the gift has been purchased.",totalMoney);

        }else {

            System.out.printf("Insufficient money: %.2f BGN.",giftPrice - totalMoney);

        }
    }
}
