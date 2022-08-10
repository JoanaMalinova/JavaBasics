package ForLoopPr;

import java.util.Scanner;

public class Hospital {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int period = Integer.parseInt(scanner.nextLine());
        int treated = 0;
        int untreated = 0;
        int doctors = 7;
        for (int i = 1; i <= period; i++) {
            int patients = Integer.parseInt(scanner.nextLine());
            if (i % 3 == 0 && untreated > treated) {
                doctors += 1;
            }
                if (patients > doctors) {
                    treated += doctors;
                    untreated += patients - doctors;
                } else {
                    treated += patients;
                }

                }
        System.out.println("Treated patients: "+treated+".");
        System.out.println("Untreated patients: "+untreated+".");


    }
}

