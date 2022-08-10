package WhileLoopLab;

import java.util.Scanner;

public class Password1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String userName = scanner.nextLine();
        String password = scanner.nextLine();
        String input = scanner.nextLine();
        while(!input.equals(password)){
            input = scanner.nextLine();
        }
        System.out.println("Welcome "+userName+"!");
    }
}
