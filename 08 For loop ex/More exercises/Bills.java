package ForLoopPr;

import java.util.Scanner;

public class Bills {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int months = Integer.parseInt(scanner.nextLine());
        double totalEl = 0;
        double totalWater=0;
        double internet = 0;

        for (int i = 1; i <=months ; i++) {
           double elBill = Double.parseDouble(scanner.nextLine());
           totalEl+= elBill;
           totalWater+=20;
           internet+=15;
        }
        double other = (totalEl+totalWater+internet)*(0.2+1);
        double average = (other+totalEl+totalWater+internet)/months;
        System.out.printf("Electricity: %.2f lv%n",totalEl);
        System.out.printf("Water: %.2f lv%n",totalWater);
        System.out.printf("Internet: %.2f lv%n",internet);
        System.out.printf("Other: %.2f lv%n",other);
        System.out.printf("Average: %.2f lv",average);
    }
}
