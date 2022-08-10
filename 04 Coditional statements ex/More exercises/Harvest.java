package CoditionalStPractical;

import java.util.Scanner;
public class ExtraHarvest {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int areaVine = Integer.parseInt(scanner.nextLine());
        double kgVinePerSqMr= Double.parseDouble(scanner.nextLine());
        int wineNeeded = Integer.parseInt(scanner.nextLine());
        int workers = Integer.parseInt(scanner.nextLine());
        double kgGrape = kgVinePerSqMr*areaVine;
        double wineVine = 0.4*kgGrape;
        double wineMade = wineVine/2.5;
        if (wineMade<wineNeeded){
            double needed = Math.floor(wineNeeded-wineMade);
            System.out.printf("It will be a tough winter! More %.0f liters wine needed.",needed);
        } else {
            double wineMade1 = Math.floor(wineMade);
            double left = Math.ceil(wineMade - wineNeeded);
            double leftPerPerson= Math.ceil(left/workers);
            System.out.printf("Good harvest this year! Total wine: %.0f liters.",wineMade1);
            System.out.println();
            System.out.printf("%.0f liters left -> %.0f liters per person.", left,leftPerPerson);
        }
    }
}
