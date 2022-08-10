package NestedLoopPr;

import java.util.Scanner;

public class WeddingSeats {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        char sector = scanner.next().charAt(0);
        int row = Integer.parseInt(scanner.nextLine());
        int seatsOdd = Integer.parseInt(scanner.nextLine());
        int seatsEven = seatsOdd + 2;

        for (int s = 65; s <= sector ; s++) {
            row ++;
            for (int r = 1; r <= row ; r++) {
                if(r%2==0) {

                    for (  int t = 97 ; t <= seatsEven + 96 ; t++) {
                        sector = (char)s;
                        char seat = (char)t;
                        System.out.printf("%c%d%c",sector,r,seat);

                    }
                }else {
                    for ( int t = 97; t <= seatsOdd + 96 ; t++) {
                        sector = (char)s;
                        char seat = (char)t;
                        System.out.printf("%c%d%c",sector,r,seat);

                    }
                }

            }
            
        }
    }
}
