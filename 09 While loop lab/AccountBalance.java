package WhileLoopLab;

import java.util.Scanner;

public class AccountBalance {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String money = scanner.nextLine();
        double balance = 0;
        while (!money.equals("NoMoreMoney")){
          double amount = Double.parseDouble(money);
            if (amount < 0) {
                System.out.println("Invalid operation!");
                break;
            }
            balance += amount;
            System.out.printf("Increase: %.2f%n",amount);
            money = scanner.nextLine();
        }
        System.out.printf("Total: %.2f",balance);

    }
}
