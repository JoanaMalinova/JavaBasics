package ExamPractice;

import java.util.Scanner;

public class MountainRun {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double recordSec = Double.parseDouble(scanner.nextLine());
        double distanceMtr = Double.parseDouble(scanner.nextLine());
        double timeMtrSec= Double.parseDouble(scanner.nextLine());
        double time = distanceMtr*timeMtrSec;
        double delay = Math.floor(distanceMtr/50)*30;
        double finalTime = time+delay;
        if(finalTime<recordSec){
            System.out.printf("Yes! The new record is %.2f seconds.",finalTime);
        }else{
            double diff = finalTime-recordSec;
            System.out.printf("No! He was %.2f seconds slower.",diff);
        }

    }
}
