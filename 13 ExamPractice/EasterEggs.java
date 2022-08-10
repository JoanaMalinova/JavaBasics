package ExamPractice;

import java.util.Scanner;

public class EasterEggs {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int paintedEggs = Integer.parseInt(scanner.nextLine());
        int red = 0;
        int orange = 0;
        int blue = 0;
        int green = 0;
        int max = Integer.MIN_VALUE;
        String colourMax= "";
        for (int i = 1; i <= paintedEggs; i++) {
            String colour = scanner.nextLine();
            switch (colour) {
                case "red" :
                    red += 1;
                    if (red>max){
                        max = red;
                        colourMax= "red";
                    }
                    break;
                case "orange" :
                    orange += 1;
                    if (orange >max){
                        max = orange;
                        colourMax = "orange";
                    }
                    break;
                case "blue" :
                    blue += 1;
                    if (blue>max){
                        max = blue;
                        colourMax = "blue";
                    }
                    break;
                case "green" :
                    green += 1;
                    if (green>max){
                        max=green;
                        colourMax = "green";
                    }
                    break;
            }

        }
        System.out.printf("Red eggs: %d%nOrange eggs: %d%nBlue eggs: %d%nGreen eggs: %d%nMax eggs: %d -> %s",red,orange,blue,green,max,colourMax);

    }
}
