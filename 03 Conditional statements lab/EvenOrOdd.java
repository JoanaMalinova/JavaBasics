package ConditionalStatements;

import java.util.Scanner;

public class EvenOrOdd {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num = Integer.parseInt(scanner.nextLine());
        boolean even = num%2==0;
        if(even){
            System.out.println("even");

        }else {
            System.out.println("odd");
        }

    }
}
