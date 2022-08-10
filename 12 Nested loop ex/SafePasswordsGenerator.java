package NestedLoopPr;

import java.util.Scanner;

public class SafePasswordsGenerator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = Integer.parseInt(scanner.nextLine());
        int b = Integer.parseInt(scanner.nextLine());
        int maxPass = Integer.parseInt(scanner.nextLine());
        char one = '#';
        char two = '@';
        int counter = 0;
        boolean maxPassReached = false;
        for (int i = 1; i <= a ; i++) {
            for (int j = 1; j <= b ; j++) {
                if(counter == maxPass){
                    maxPassReached = true;
                    break;

                }
                if( one == 55 ) {
                    one = 35;
                    }
                if(two == 96) {
                   two = 64;
                    }
                System.out.printf("%c%c%d%d%c%c|",(char)one,(char)two,i,j,(char)two,(char)one);
                one ++;
                two++;
                counter++;

                }
            if(maxPassReached){
                break;
            }
        }
    }
}
