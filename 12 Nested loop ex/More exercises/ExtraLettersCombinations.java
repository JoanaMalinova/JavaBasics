package NestedLoopPr;

import java.util.Scanner;

public class ExtraLettersCombinations {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        char firstLetter = scanner.next().charAt(0);
        char lastLetter = scanner.next().charAt(0);
        char oddLetter = scanner.next().charAt(0);
        int counter = 0;
        for (int i = firstLetter; i <= lastLetter ; i++) {
            for (int j = firstLetter; j <= lastLetter; j++) {
                for (int k = firstLetter; k <= lastLetter; k++) {
                    if (i != oddLetter && j!= oddLetter & k != oddLetter){
                        char a = (char)i;
                        char b = (char)j;
                        char c = (char)k;
                        counter++;
                        System.out.printf("%c%c%c ",a,b,c);
                    }

                }

            }
            
        }
        System.out.println(counter);
    }
}
