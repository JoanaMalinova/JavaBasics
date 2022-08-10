package CoditionalStPractical;

import java.util.Scanner;

public class SumSeconds {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int first = Integer.parseInt(scanner.nextLine());
        int second = Integer.parseInt(scanner.nextLine());
        int third = Integer.parseInt(scanner.nextLine());
        int totalTime = first+second+third;
        int minutes = totalTime/60;
        int seconds = totalTime%60;

        System.out.printf("%d:%02d",minutes,seconds);



    }
}
