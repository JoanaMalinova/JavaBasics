package WhileLoopPractice;

import java.util.Scanner;

public class ExamPreparation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int lowGrade = Integer.parseInt(scanner.nextLine());
        String problem = scanner.nextLine();
        int sum = 0;
        int num = 0;
        int fail = 0;
        boolean hasFailed = false;
        String lastProblem = "";
        while (!problem.equals("Enough")){
            lastProblem = problem;
            int grade = Integer.parseInt(scanner.nextLine());
            num += 1;
            sum +=grade;
            if(grade<=4){
                fail += 1;
                if(fail==lowGrade){
                    hasFailed = true;
                    System.out.printf("You need a break, %d poor grades.",fail);
                    break;
                }
            }
            problem = scanner.nextLine();

        }
        if(!hasFailed) {
            double average = sum * 1.0 / num;
            System.out.printf("Average score: %.2f%n", average);
            System.out.printf("Number of problems: %d%n", num);
            System.out.printf("Last problem: %s", lastProblem);
        }
    }
}
