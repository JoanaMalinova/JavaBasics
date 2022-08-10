package ForLoopPr;

import java.util.Scanner;

public class OddEvenPosition {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n =Integer.parseInt(scanner.nextLine());
        double oddSum = 0;
        double evenSum = 0;
        double maxOdd = Integer.MIN_VALUE;
        double maxEven = Integer.MIN_VALUE;
        double minOdd = Integer.MAX_VALUE;
        double minEven = Integer.MAX_VALUE;
        for (int i = 1; i <=n ; i++) {
           double num = Double.parseDouble(scanner.nextLine());;
            if(i%2==0){
                evenSum += num;
                if(num>maxEven)   {
                    maxEven=num;
                }
                if(num< minEven) {
                    minEven =num;
                }

            }else {
                if (num<minOdd){
                    minOdd=num;
                }
                if(num>maxOdd){
                    maxOdd=num;
                }
                oddSum += num;
            }
        }

        System.out.printf("OddSum=%.2f,%n",oddSum);
        if(minOdd==Integer.MAX_VALUE){
            System.out.println("OddMin=No,");
        }else{
        System.out.printf("OddMin=%.2f,%n",minOdd);
        }
        if(maxOdd==Integer.MIN_VALUE){
            System.out.println("OddMax=No,");
        }else{
            System.out.printf("OddMax=%.2f,%n",maxOdd);
        }
        System.out.printf("EvenSum=%.2f,%n",evenSum);
        if(minEven==Integer.MAX_VALUE){
            System.out.println("EvenMin=No,");
        }else {
        System.out.printf("EvenMin=%.2f,%n",minEven);
        }
        if (maxEven==Integer.MIN_VALUE){
            System.out.println("EvenMax=No");
        }else{
        System.out.printf("EvenMax=%.2f",maxEven);
        }
    }
}
