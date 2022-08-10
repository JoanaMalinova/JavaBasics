package WhileLoopPractice;

import java.util.Scanner;

public class ExamEasterEggsBattle {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int eggsPl1 = Integer.parseInt(scanner.nextLine());
        int eggsP2 = Integer.parseInt(scanner.nextLine());
        String winner = scanner.nextLine();
        boolean eggsOver = false;
        while ( !winner.equals("End")) {
            switch (winner) {
                case "one":
                    eggsP2 -=1;
                    break;
                case"two":
                    eggsPl1 -=1;
                    break;

            }
            if (eggsPl1 == 0) {
                System.out.printf("Player one is out of eggs. Player two has %d eggs left.",eggsP2);
                eggsOver = true;
                break;

            }
            if(eggsP2 == 0){
                System.out.printf("Player two is out of eggs. Player one has %d eggs left.",eggsPl1);
                eggsOver = true;
                break;

            }
            winner = scanner.nextLine();
        }
        if (!eggsOver){
        System.out.printf("Player one has %d eggs left.%n",eggsPl1);
        System.out.printf("Player two has %d eggs left.",eggsP2);
        }
    }
}
