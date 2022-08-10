package NestedLoopPr;

import java.util.Scanner;

public class TrainTheTrainers2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());
        String presentation = scanner.nextLine();
        double totalGrade = 0;
        double finalGrade = 0;
        int counter =0;
        while(!presentation.equals("Finish")){
            for (int i = 1; i <= n; i++) {
                double grade = Double.parseDouble(scanner.nextLine());
                totalGrade += grade ;
                counter++;
            }
            finalGrade += totalGrade;
            System.out.printf("%s - %.2f.%n",presentation,totalGrade/n);
            totalGrade = 0;
            presentation = scanner.nextLine();
        }
        System.out.printf("Student's final assessment is %.2f.",finalGrade/counter);
    }
}
