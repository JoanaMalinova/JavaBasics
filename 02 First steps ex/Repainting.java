package FirstStepsPractical;

import java.util.Scanner;

public class Repainting {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int nylon = Integer.parseInt(scanner.nextLine());
        int paint = Integer.parseInt(scanner.nextLine());
        int dilute =Integer.parseInt(scanner.nextLine());
        int workTime= Integer.parseInt(scanner.nextLine());
        double nylonPrice = (nylon+2)*1.5;
        double paintPrice = (paint+ 10.0*paint/100)*14.5;
        double dilutePrice = dilute*5.0;
        double totalPriceMaterials = nylonPrice+paintPrice+dilutePrice+0.4;
        double totalPrice= totalPriceMaterials+0.3*totalPriceMaterials*workTime;
        System.out.println(totalPrice);



    }
}
