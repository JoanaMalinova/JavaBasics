package WhileLoopPractice;

import java.util.Scanner;

public class ExamEasterShop {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int eggsInShop = Integer.parseInt(scanner.nextLine());
        String close = scanner.nextLine();
        boolean notEnoughEggs = false;
        int eggSold = 0;
        while (!close.equals("Close")) {
            int eggs = Integer.parseInt(scanner.nextLine());
            switch (close){
                case "Buy":
                    eggsInShop -= eggs;
                    eggSold += eggs;
                    break;
                case "Fill":
                    eggsInShop += eggs;
                    break;
            }
            if (eggsInShop <0 ) {
                eggsInShop += eggs;
                notEnoughEggs = true;
                System.out.println("Not enough eggs in store!");
                System.out.printf("You can buy only %d.",eggsInShop);
                break;
            }
            close = scanner.nextLine();
        }
        if(!notEnoughEggs){
        System.out.println("Store is closed!");
        System.out.printf("%d eggs sold.",eggSold);
        }

    }
}
