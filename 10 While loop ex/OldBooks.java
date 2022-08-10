package WhileLoopPractice;

import java.util.Scanner;

public class OldBooks {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String wantedBook = scanner.nextLine();
        String book = scanner.nextLine();
        boolean isFound = false;
        int sum = 0;
        while (!book.equals("No More Books")) {
            if (book.equals(wantedBook)) {
               isFound = true;
                break;
            }
            sum +=1;
            book = scanner.nextLine();

        }
        if(isFound){
            System.out.printf("You checked %d books and found it.",sum);
        }else{
        System.out.println("The book you search is not here!");
        System.out.printf("You checked %d books.",sum);
        }



    }
}
