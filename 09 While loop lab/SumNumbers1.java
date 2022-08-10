package WhileLoopLab;

import java.util.Scanner;

public class SumNumbers1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num = Integer.parseInt(scanner.nextLine());
        int sum = 0;
        while(sum<num){
            int num1 = Integer.parseInt(scanner.nextLine());
            sum += num1;
        }
        System.out.println(sum);
    }

}
