package WhileLoopLab;

import java.util.Scanner;

public class Password {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String userName = scanner.nextLine();
        String password = scanner.nextLine();
        while (true) {
           String password1 = scanner.nextLine();
            if (password1.equals(password)) {
                break;
            }
        }
        System.out.println("Welcome " + userName+"!");
    }
}

