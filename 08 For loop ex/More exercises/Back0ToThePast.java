package ForLoopPr;

import java.util.Scanner;

public class Back0ToThePast {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double money = Double.parseDouble(scanner.nextLine());
        int year = Integer.parseInt(scanner.nextLine());
        double expenses = 0;
        int age = 17;
        for(int i=0;i<=year-1800;i++){
            age+=1;
            if (i%2==0){
                expenses+=12000;

            }else {
                expenses+=12000+50*age;
            }
        }
        double diff = Math.abs(money-expenses);
        if(money-expenses>=0){
            System.out.printf("Yes! He will live a carefree life and will have %.2f dollars left.",diff);

        }else {
            System.out.printf("He will need %.2f dollars to survive.",diff);

        }

    }
}
