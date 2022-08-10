package ForLoopPr;

import java.util.Scanner;

public class FootballLeague {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int capacity = Integer.parseInt(scanner.nextLine());
        int fans = Integer.parseInt(scanner.nextLine());
        int fanA = 0;
        int fanB = 0;
        int fanV = 0;
        int fanG = 0;
        for (int i = 1; i <=fans ; i++) {
            String sector = scanner.nextLine();
            switch (sector){
                case "A":
                    fanA+=1;
                    break;
                case"B":
                    fanB+=1;
                    break;
                case"V":
                    fanV+=1;
                    break;
                case"G":
                    fanG+=1;
                    break;
           }
        }
        double percentA = fanA*100.0/fans;
        double percentB = fanB*100.0/fans;
        double percentV = fanV*100.0/fans;
        double percentG = fanG*100.0/fans;
        double percentFans = fans*100.0/capacity;
        System.out.printf("%.2f%%%n",percentA);
        System.out.printf("%.2f%%%n",percentB);
        System.out.printf("%.2f%%%n",percentV);
        System.out.printf("%.2f%%%n",percentG);
        System.out.printf("%.2f%%",percentFans);
    }
}
