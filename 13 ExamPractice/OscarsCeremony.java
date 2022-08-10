package ExamPractice;

import java.util.Scanner;

public class OscarsCeremony {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int rent = Integer.parseInt(scanner.nextLine());
        double statuettes =rent- rent*0.3;
        double catering = statuettes - 0.15*statuettes;
        double sound = 0.5*catering;
        double total = statuettes+catering+sound+rent;
        System.out.printf("%.2f",total);
    }
}
