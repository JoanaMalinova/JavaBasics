package ForLoopPr;

import java.util.Scanner;

public class TrekkingMania {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int groupClimbersNum = Integer.parseInt(scanner.nextLine());
        int musala = 0;
        int monblan = 0;
        int kilimanjaro = 0;
        int k2 = 0;
        int everest =0;
        for (int i =1;i<=groupClimbersNum;i++){
            int climbers = Integer.parseInt(scanner.nextLine());
            if(climbers<=5){
                musala+=climbers;
            }else if(climbers<=12){
                monblan+=climbers;
            }else if(climbers<=25){
                kilimanjaro+=climbers;
            }else if(climbers<=40){
                k2+=climbers;
            }else {
                everest+=climbers;
            }
        }
        int total = musala+monblan+kilimanjaro+k2+everest;
        System.out.printf("%.2f%%%n", musala*100.0/total);
        System.out.printf("%.2f%%%n",monblan*100.0/total);
        System.out.printf("%.2f%%%n",kilimanjaro*100.0/total);
        System.out.printf("%.2f%%%n", k2*100.0/total);
        System.out.printf("%.2f%%",everest*100.0/total);

    }
}
