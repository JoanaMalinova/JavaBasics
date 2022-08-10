package WhileLoopPractice;

import java.util.Scanner;

public class ExamRenovation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int height = Integer.parseInt(scanner.nextLine());
        int width = Integer.parseInt(scanner.nextLine());
        int areaNotToBePainted = Integer.parseInt(scanner.nextLine());
        double areaToBePainted =Math.ceil( height*width*4*(1-1.0*areaNotToBePainted/100));
        String tired = scanner.nextLine();
        boolean allIsPainted = false;
        while (!tired.equals("Tired!")){
            int paint = Integer.parseInt(tired);
            areaToBePainted -= paint;
            if(areaToBePainted < 0){
                allIsPainted = true;
                System.out.printf("All walls are painted and you have %.0f l paint left!",Math.abs(areaToBePainted));
                break;
            }else if (areaToBePainted ==0){
                allIsPainted = true;
                System.out.print("All walls are painted! Great job, Pesho!");
                break;

            }
            tired = scanner.nextLine();
        }
        if(!allIsPainted){
        System.out.printf("%.0f quadratic m left.",areaToBePainted);
        }
    }
}
