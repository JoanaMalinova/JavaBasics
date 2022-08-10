package ForLoopPr;

import java.util.Scanner;

public class CleverLily {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int age = Integer.parseInt(scanner.nextLine());
        double washingMachinePrice = Double.parseDouble(scanner.nextLine());
        int toyPrice = Integer.parseInt(scanner.nextLine());
        int toyNum=0;
        int money =0;
        int brotherMoney=0;
        for(int i =1; i<=age; i++){
            if(i%2==0){
                money+=10*i/2;
                brotherMoney+=1;

            }else{
                toyNum+=1;

            }
        }
        double totalSum = money+toyNum*toyPrice-brotherMoney;
        double diff = Math.abs(washingMachinePrice-totalSum);
        if(washingMachinePrice<=totalSum){
            System.out.printf("Yes! %.2f",diff);
        }else{
            System.out.printf("No! %.2f",diff);
        }

    }
}
