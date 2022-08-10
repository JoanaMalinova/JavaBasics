package ForLoopPr;

import java.util.Scanner;

public class GameOfIntervals {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int moves = Integer.parseInt(scanner.nextLine());
        double result = 0;
        double invalidPercent = 0;
        double percent1 = 0;
        double percent2 = 0;
        double percent3= 0;
        double percent4 = 0;
        double percent5 = 0;
        for (int i =1 ;i<= moves;i++){
            int num = Integer.parseInt(scanner.nextLine());
            if(num<0||num>50){
                result=result/2;
                invalidPercent+=1;
            }else if(num<=9){
                result+=0.2*num;
                percent1+=1;
            }else if(num<=19){
                result+=0.3*num;
                percent2+=1;

            }else if(num<=29){
                result+=0.4*num;
                percent3+=1;

            }else if(num<=39){
                result+=50;
                percent4+=1;

            }else if(num<=50){
                result+=100;
                percent5+=1;
            }
        }

        System.out.printf("%.2f%n",result);
        System.out.printf("From 0 to 9: %.2f%%%n",100*percent1/moves);
        System.out.printf("From 10 to 19: %.2f%%%n",100*percent2/moves);
        System.out.printf("From 20 to 29: %.2f%%%n",100*percent3/moves);
        System.out.printf("From 30 to 39: %.2f%%%n",100*percent4/moves);
        System.out.printf("From 40 to 50: %.2f%%%n",100*percent5/moves);
        System.out.printf("Invalid numbers: %.2f%%",100*invalidPercent/moves);
    }
}
