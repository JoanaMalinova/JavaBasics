package WhileLoopLab;

import java.util.Scanner;

public class SumNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num = Integer.parseInt(scanner.nextLine());
        int sum = 0;
        while(true){
            int num1 = Integer.parseInt(scanner.nextLine());
           sum += num1;
            if(sum>=num){
                break;
            }
        }
        System.out.println(sum);
    }
}
