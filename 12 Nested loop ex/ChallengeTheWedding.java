package NestedLoopPr;

import java.util.Scanner;

public class ChallengeTheWedding {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int men = Integer.parseInt(scanner.nextLine());
        int women = Integer.parseInt(scanner.nextLine());
        int tablesFree = Integer.parseInt(scanner.nextLine());
        int tablesTaken = 0;
        boolean noMoreTables = false;

        for (int m = 1; m <= men ; m++) {
            for (int w = 1; w <= women; w++) {
                    System.out.printf("(%d <-> %d) ",m,w);
                    tablesTaken ++;
                    if(tablesTaken == tablesFree){
                        noMoreTables = true;
                        break;
                    }
                 }
            if(noMoreTables){
                break;
            }
                
        }

    }
}
