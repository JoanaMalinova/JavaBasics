package ForLoopPr;

import java.util.Scanner;

public class Oscars {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String actorName = scanner.nextLine();
        double academyPoints = Double.parseDouble(scanner.nextLine());
        int juryNum = Integer.parseInt(scanner.nextLine());
        double totalPoints = academyPoints;
        for(int i =1;i<=juryNum;i++){
            String juryName = scanner.nextLine();
            double juryPoints = Double.parseDouble(scanner.nextLine());
            totalPoints+=juryName.length()*juryPoints/2;
           if(totalPoints>1250.5){
                System.out.printf("Congratulations, %s got a nominee for leading role with %.1f!",actorName,totalPoints);
                i=juryNum+1;
            }
        }if(totalPoints<1250.5){
            double diff = 1250.5-totalPoints;
            System.out.printf("Sorry, %s you need %.1f more!",actorName,diff);
        }
    }
}
