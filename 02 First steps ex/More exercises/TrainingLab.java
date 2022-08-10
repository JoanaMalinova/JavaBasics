package FirstStepsPractical;

import java.util.Scanner;

public class ExtraTrainingLab {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double length = Double.parseDouble(scanner.nextLine());
        double width = Double.parseDouble(scanner.nextLine());
        double width1 = 100*width-100;
        double length1= 100*length;
        double a =Math.floor(width1/70);
        double b =Math.floor(length1/120);
        double workingPlace= a*b-3;
        System.out.printf("%.0f",workingPlace);
    }
}
