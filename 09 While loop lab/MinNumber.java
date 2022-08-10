package WhileLoopLab;

import java.util.Scanner;

public class MinNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        int num = 0;
        int min = Integer.MAX_VALUE;
        while (!input.equals("Stop")) {
            num = Integer.parseInt(input);
            if(num<min){
                min = num;
            }
            input = scanner.nextLine();
        }
        System.out.println(min);
    }
}
