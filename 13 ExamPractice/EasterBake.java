package ExamPractice;

import java.util.Scanner;

public class EasterBake {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int kozunakCount = Integer.parseInt(scanner.nextLine());
        double totalSugar = 0;
        double totalFlour = 0;
        int  maxFlour = Integer.MIN_VALUE;
        int maxSugar = Integer.MIN_VALUE;
        for (int i = 1; i <= kozunakCount ; i++) {
            int sugar = Integer.parseInt(scanner.nextLine());
            int flour = Integer.parseInt(scanner.nextLine());
            totalFlour += flour;
            totalSugar += sugar;
            if (sugar> maxSugar) {
                maxSugar = sugar;
            }
            if (flour>maxFlour) {
                maxFlour = flour;
            }


        }
        System.out.printf("Sugar: %.0f%nFlour: %.0f%n",Math.ceil(totalSugar/950),Math.ceil(totalFlour/750));
        System.out.printf("Max used flour is %d grams, max used sugar is %d grams.",maxFlour,maxSugar);
    }
}
