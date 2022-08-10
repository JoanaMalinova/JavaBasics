package WhileLoopPractice;

import java.util.Scanner;

public class ExamBestPlayer {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String name = scanner.nextLine();
        int mostGoals = 0;
        String bestPlayer = "";
        boolean hatTrick = false;
        while (!name.equals("END")) {
            int goals = Integer.parseInt(scanner.nextLine());
            if (goals > mostGoals) {
                bestPlayer = name;
                mostGoals = goals;
            }
            if ( mostGoals >= 3 ) {
                hatTrick = true;
                if ( mostGoals >= 10 ){
                    break;
                }
            }
            name = scanner.nextLine();

        }
        System.out.printf("%s is the best player!%n", bestPlayer);
        if (hatTrick) {
            System.out.printf("He has scored %d goals and made a hat-trick !!!", mostGoals);
        } else {
            System.out.printf("He has scored %d goals.", mostGoals);
        }


    }
}
