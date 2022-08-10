package NestedLoopPr;

import java.util.Scanner;

public class SpecialNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());
        int num = 0;
        int counter = 0;
        for (int i = 1111; i <= 9999 ; i++) {
            String number = ""+i;
            for (int j = 0; j < number.length(); j++) {
                char converter = number.charAt(j);
                int currentNum = Integer.parseInt(""+ converter);
                if(currentNum == 0){
                    break;
                }
                if(n % currentNum == 0){
                    counter ++;
                    continue;
                }else {
                    break;
                }
            }
            if(counter == 4){

                System.out.print(i+" ");
            }
            counter = 0;

        }
    }
}
