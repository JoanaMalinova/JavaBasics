package NestedLoopPr;

import java.util.Scanner;

public class ExtraUniquePINCodes {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int firstNumEnd = Integer.parseInt(scanner.nextLine());
        int secondNumEnd = Integer.parseInt(scanner.nextLine());
        int thirdNumEnd = Integer.parseInt(scanner.nextLine());
        for (int i = 2; i <= firstNumEnd; i+=2) {
            for (int j = 2; j <= secondNumEnd ; j++) {
                if (j!=2&&j!=3&&j!=5&&j!=7){
                   continue;
                }
                for (int k = 2; k <= thirdNumEnd ; k+=2) {
                    System.out.println(i+" "+ j+" "+k);
                }
            }
        }
    }
}
