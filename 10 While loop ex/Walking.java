package WhileLoopPractice;

import java.util.Scanner;

public class Walking {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String goingHome = scanner.nextLine();
        int totalSteps = 0;
        int diff = 0;
        int stepsToHome = 0;
        boolean goalReached = false;
        while(!goingHome.equals("Going home")){
            int steps = Integer.parseInt(goingHome);
            totalSteps += steps;
            if(totalSteps>=10000){
                goalReached = true;
                diff =totalSteps - 10000;
                break;

            }
            goingHome = scanner.nextLine();

        }
        if(goingHome.equals("Going home")) {
            stepsToHome = Integer.parseInt(scanner.nextLine());
            totalSteps += stepsToHome;
            diff = Math.abs(totalSteps - 10000);
        }
        if(totalSteps>=10000){
            goalReached = true;
        }

        if(goalReached) {
            System.out.println("Goal reached! Good job!");
            System.out.printf("%d steps over the goal!", diff);
        }else {
            System.out.printf("%d more steps to reach goal.", diff);
        }
    }
}
