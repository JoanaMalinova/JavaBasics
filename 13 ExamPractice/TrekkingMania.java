package ExamPractice;

import java.util.Scanner;

public class ExamTrekkingMania {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int groupNum = Integer.parseInt(scanner.nextLine());
        int musala = 0;
        int monblan = 0;
        int kilimanjaro = 0;
        int k2 = 0;
        int everest = 0;
        int total = 0;
        for (int i = 1; i <=groupNum ; i++) {
            int trekkers = Integer.parseInt(scanner.nextLine());
             total += trekkers;
            if (trekkers<=5){
                musala += trekkers;

            }else if (trekkers<=12){
                monblan += trekkers;

            }else if (trekkers<=25){
                kilimanjaro += trekkers;

            }else if (trekkers<=40){
                k2 += trekkers;

            }else {
                everest += trekkers;


            }
        }
        System.out.printf("%.2f%%%n",musala*100.0/total);
        System.out.printf("%.2f%%%n",monblan*100.0/total);
        System.out.printf("%.2f%%%n",kilimanjaro*100.0/total);
        System.out.printf("%.2f%%%n",k2*100.0/total);
        System.out.printf("%.2f%%%n",everest*100.0/total);
    }
}
