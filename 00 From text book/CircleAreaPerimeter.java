package FromTextBook;

import java.util.Scanner;

public class CircleAreaPerimeter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double r = Double.parseDouble(scanner.nextLine());
        double area =r*r*Math.PI;
        double perimeter= 2*r*Math.PI;
        System.out.println("Area = "+area);
        System.out.println("Perimeter = "+perimeter);

    }
}
