package ForLoopPr;

import java.util.Scanner;

public class Salary {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());
        int salary = Integer.parseInt(scanner.nextLine());
        int fine =0;
        for(int i = 1;i<=n ;i++){
            String openTab = scanner.nextLine();
            if(openTab.equals("Facebook")){

                fine += 150;

            }else if (openTab.equals("Instagram")){

                fine += 100;

            }else if (openTab.equals("Reddit")){

                fine += 50;

            }
        }
        if(salary<=fine){
            System.out.println("You have lost your salary.");
        }else {
            int diff = salary-fine;
            System.out.printf("%d",diff);

        }
    }
}
