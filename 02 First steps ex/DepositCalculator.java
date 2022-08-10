package FirstStepsPractical;

import java.util.Scanner;

public class DepositCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double deposit = Double.parseDouble(scanner.nextLine());
        int month = Integer.parseInt(scanner.nextLine());
        double interest = Double.parseDouble(scanner.nextLine());
        double finalInterest =deposit*interest/100;
        double sum =deposit+month*finalInterest/12;
        System.out.println(sum);
    }
}
