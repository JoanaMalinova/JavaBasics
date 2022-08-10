package ConditionalStAdvPrActice;

import java.util.Scanner;

public class ExtraMultiplyBy2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int i = Integer.parseInt(scanner.nextLine());
        while (i>=0){
            int i1= i*2;
            System.out.printf("Result : %.2d",i1);
        }

    }
}
