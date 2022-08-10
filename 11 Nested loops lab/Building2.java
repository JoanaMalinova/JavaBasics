package NestedLoops;

import java.util.Scanner;

public class Building2 {public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    int floors = Integer.parseInt(scanner.nextLine());
    int aprtPerFloor = Integer.parseInt(scanner.nextLine());
    for (int fl = floors; fl >=1 ; fl--) {
        System.out.println();
        for (int ap = 0; ap < aprtPerFloor; ap++) {
            if(floors == 1||fl == floors){
                System.out.printf("L%d%d ",fl,ap);
            }else if(fl % 2 ==0){
                System.out.printf("O%d%d ",fl,ap);
            }else {
                System.out.printf("A%d%d ",fl,ap);
            }

        }


    }
}
}
