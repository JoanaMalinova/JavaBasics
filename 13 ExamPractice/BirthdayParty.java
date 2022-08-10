package ExamPractice;

import java.util.Scanner;

public class BirthdayParty {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double rent = Double.parseDouble(scanner.nextLine());;
        double cake = 0.2*rent;
        double drinks = cake- 0.45*cake;
        double animator =rent/3;
        double sum = rent+cake+drinks+animator;
        System.out.printf("%.1f",sum);

    }
}
