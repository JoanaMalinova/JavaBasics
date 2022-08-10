import java.util.Scanner;

public class YardGreening {
    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);
        double area =Double.parseDouble(scanner.nextLine());
        double price= 7.61* area;
        double discount = price*0.18;
        double finalPrice = price-discount;
        System.out.println(finalPrice);
        System.out.println(discount);
    }
}
