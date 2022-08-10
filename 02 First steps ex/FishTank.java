package FirstStepsPractical;

import java.util.Scanner;

public class FishTank {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int length = Integer.parseInt(scanner.nextLine());
        int width = Integer.parseInt(scanner.nextLine());
        int depth = Integer.parseInt(scanner.nextLine());
        double percent = Double.parseDouble(scanner.nextLine());
        int volume = length*width*depth;
        double leftover = volume - percent*volume/100;
        double dmVolume = leftover/1000;
        System.out.println(dmVolume);
    }
}
