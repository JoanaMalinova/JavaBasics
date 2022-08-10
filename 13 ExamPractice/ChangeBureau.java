package ExamPractice;

import java.util.Scanner;

public class ChangeBureau {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int bitcoin = Integer.parseInt(scanner.nextLine());
        double chineseMoney = Double.parseDouble(scanner.nextLine());
        double commission = Double.parseDouble(scanner.nextLine());
        double bitToLev = 1168*bitcoin;
        double chineseToDollar = chineseMoney*0.15;
        double dollarToLev = chineseToDollar*1.76;
        double totalLev = bitToLev+dollarToLev;
        double levToEuro = totalLev/1.95;
        double euro = levToEuro - commission/100*levToEuro;
        System.out.printf("%.2f",euro);


    }
}
