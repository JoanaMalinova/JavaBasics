package FirstStepsPractical;

import java.util.Scanner;

public class HousePainting {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double x = Double.parseDouble(scanner.nextLine());
        double y = Double.parseDouble(scanner.nextLine());
        double h = Double.parseDouble(scanner.nextLine());
        double backWall = x*x;
        double frontWall = backWall -1.2*2;
        double sidewall = x*y - 1.5*1.5;
        double sideRoofWall = x*y;
        double frontRoofWall= x*h/2;
        double greenArea =frontWall+backWall+2*sidewall;
        double redArea =2*sideRoofWall+2*frontRoofWall;
        double greenPaint = greenArea/3.4;
        double redPaint = redArea/4.3;
        System.out.printf("%.2f",greenPaint);
        System.out.println();
        System.out.printf("%.2f",redPaint);
    }
}
