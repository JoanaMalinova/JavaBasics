package ForLoopPr;

import java.util.Scanner;

public class PCGameShop {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());
        int stone = 0;
        int fort = 0;
        int over = 0;
        int others =0;
        for (int i = 1; i <= n; i++) {
            String game = scanner.nextLine();
            switch (game) {
                case "Hearthstone":
                    stone += 1;
                    break;
                case "Fornite" :
                    fort += 1;
                    break;
                case"Overwatch":
                    over += 1;
                    break;
               default:
                    others += 1;
                    break;
            }

        }
        int total = stone + fort + over + others;
        System.out.printf("Hearthstone - %.2f%%%n",stone*100.0/total);
        System.out.printf("Fornite - %.2f%%%n",fort*100.0/total);
        System.out.printf("Overwatch - %.2f%%%n",over*100.0/total);
        System.out.printf("Others - %.2f%%",others*100.0/total);
    }
}
