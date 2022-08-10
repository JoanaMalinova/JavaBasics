package ConditionalStAdvPrActice;

import java.util.Scanner;

public class ExtraSchoolCamp {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String season = scanner.nextLine();
        String groupType = scanner.nextLine();
        int studentNum = Integer.parseInt(scanner.nextLine());
        int nights = Integer.parseInt(scanner.nextLine());
        double stayPrice = 0;
        String sport = "";
        switch(season){
            case "Winter":
                switch (groupType){
                    case "girls":
                        stayPrice=9.6*nights*studentNum;
                        sport="Gymnastics";
                        break;
                    case"boys":
                        stayPrice=9.6*nights*studentNum;
                        sport="Judo";
                        break;
                    case"mixed":
                        stayPrice=10*nights*studentNum;
                        sport = "Ski";
                        break;
                }
                break;
            case"Spring":
                switch (groupType){
                    case "girls":
                        stayPrice=7.2*nights*studentNum;
                        sport="Athletics";
                        break;
                    case"boys":
                        stayPrice=7.2*nights*studentNum;
                        sport="Tennis";
                        break;
                    case"mixed":
                        stayPrice=9.5*nights*studentNum;
                        sport = "Cycling";
                        break;
                }
                break;
            case"Summer":
                switch (groupType){
                    case "girls":
                        stayPrice=15*nights*studentNum;
                        sport="Volleyball";
                        break;
                    case"boys":
                        stayPrice=15*nights*studentNum;
                        sport="Football";
                        break;
                    case"mixed":
                        stayPrice=20*nights*studentNum;
                        sport = "Swimming";
                        break;
                }
                break;
        }
        if(studentNum>=50){
            stayPrice-=stayPrice*0.5;

        }else if(studentNum>=20){
            stayPrice-=stayPrice*0.15;

        }else if (studentNum>=10){
            stayPrice-=stayPrice*0.05;

        }
        System.out.printf("%s %.2f lv.",sport,stayPrice);
    }
}
