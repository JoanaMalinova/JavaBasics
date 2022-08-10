package WhileLoopPractice;

import java.util.Scanner;

public class ExamSuitcasesLoad {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double capacity = Double.parseDouble(scanner.nextLine());
        String end = scanner.nextLine();
        double spaceLeft = capacity;
        boolean noMoreSpace = false;
        int counter = 0;
        while(!end.equals("End")) {
            double caseVolume = Double.parseDouble(end);
            counter++;
            if (counter%3==0){
                caseVolume += 0.1*caseVolume;
            }
            spaceLeft -= caseVolume;
            if (spaceLeft<0){
                noMoreSpace = true;
                break;
            }
            end = scanner.nextLine();
        }
        if(noMoreSpace) {
            System.out.println("No more space!");
            System.out.printf("Statistic: %d suitcases loaded.",counter - 1);
        }else {
            System.out.println("Congratulations! All suitcases are loaded!");
            System.out.printf("Statistic: %d suitcases loaded.",counter);
        }

    }
}
