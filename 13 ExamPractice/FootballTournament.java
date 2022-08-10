package ExamPractice;

import java.util.Scanner;

public class ExamFootballTournament {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String team = scanner.nextLine();
        int games = Integer.parseInt(scanner.nextLine());
        int points = 0;
        int win = 0;
        int draw = 0;
        int lose = 0;
        for (int i = 1; i <= games  ; i++) {
            String outcome = scanner.nextLine();
            switch (outcome) {
                case "W" :
                    points += 3;
                    win += 1;
                    break;
                case "D" :
                    points += 1;
                    draw += 1;
                    break;
                case "L" :
                    lose += 1;
                    break;
            }

        }
        int total = win+draw+lose;
        if (games == 0) {
            System.out.printf("%s hasn't played any games during this season.%n",team);

        }else {
            System.out.printf("%s has won %d points during this season.%n",team,points);
            System.out.printf("Total stats:%n## W: %d%n## D: %d%n## L: %d%nWin rate: %.2f%%",win,draw,lose,win*100.0/total);

        }

    }
}
