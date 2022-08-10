package ExamPractice;

import java.util.Scanner;

public class PoolDay {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int people = Integer.parseInt(scanner.nextLine());
        double entryFee = Double.parseDouble(scanner.nextLine());
        double loungeFee = Double.parseDouble(scanner.nextLine());
        double umbrellaFee = Double.parseDouble(scanner.nextLine());
        double loungeTotal = Math.ceil(0.75*people)*loungeFee;
        double umbrellaTotal = Math.ceil(people*0.5)*umbrellaFee;
        double sum =loungeTotal+umbrellaTotal+entryFee*people;
        System.out.printf("%.2f lv.",sum);

    }
}
