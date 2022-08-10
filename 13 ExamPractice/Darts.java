package WhileLoopPractice;

import java.util.Scanner;

public class ExamDarts {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String name = scanner.nextLine();
        String sinDoubTri = scanner.nextLine();
        int points = 301;
        int successShots = 0;
        int failShots = 0;
        boolean pointsZero = false;
        while (!sinDoubTri.equals("Retire")) {
            int currentPoints = Integer.parseInt(scanner.nextLine());
            switch (sinDoubTri) {
                case "Double":
                    currentPoints += currentPoints;
                    break;
                case "Triple":
                    currentPoints += 2 * currentPoints;
                    break;
            }
            points -= currentPoints;
            if (points == 0) {
                successShots++;
                pointsZero = true;
                break;
            } else if (points < 0) {
                points += currentPoints;
                failShots++;
                sinDoubTri = scanner.nextLine();
                continue;
            } else {
                successShots++;
                sinDoubTri = scanner.nextLine();
            }
        }
        if (pointsZero) {
            System.out.printf("%s won the leg with %d shots.",name,successShots);
        }else {
            System.out.printf("%s retired after %d unsuccessful shots.",name,failShots);


        }
    }
}
