package ForLoopPr;

import java.util.Scanner;

public class HalfSumElement {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n =Integer.parseInt(scanner.nextLine());
        int sum =0;
        int biggest = Integer.MIN_VALUE;
        for(int i =1;i<=n;i++){
            int num = Integer.parseInt(scanner.nextLine());
            if(num>biggest){
                biggest=num;
            }
            sum+=num;
        }
        if(biggest==sum-biggest){
            System.out.println("Yes" );
            System.out.println("Sum = " + biggest);

        }else{
            int diff = Math.abs(sum-2*biggest);

            System.out.println("No");
            System.out.println("Diff = "+diff );

        }


    }
}
