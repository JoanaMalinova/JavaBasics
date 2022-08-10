package ForLoopLab;

import java.util.Scanner;

public class LeftAndRightSum {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int leftSum = 0;
        int rightSum=0;
        int n = Integer.parseInt(scanner.nextLine());
        for(int i= 1;i<=n;i++){
            leftSum+=Integer.parseInt(scanner.nextLine());
        }
        for (int i=1;i<=n;i++){
            rightSum+=Integer.parseInt(scanner.nextLine());
        }
        if(leftSum==rightSum){
            System.out.printf("Yes, sum = %d",leftSum);
        }else{
            int diff= Math.abs(leftSum-rightSum);
            System.out.printf("No, diff = %d",diff);
        }


    }
}
