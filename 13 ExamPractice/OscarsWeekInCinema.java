package ExamPractice;

import java.util.Scanner;

public class OscarsWeekInCinema {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String movie = scanner.nextLine();
        String theatreType = scanner.nextLine();
        int tickets = Integer.parseInt(scanner.nextLine());
        double price = 0;
        switch(movie){
            case"A Star Is Born":
                switch(theatreType){
                    case"normal":
                        price = 7.5;
                        break;
                    case"luxury":
                        price = 10.5;
                        break;
                    case"ultra luxury":
                        price = 13.5;
                        break;
                }
                break;
            case "Bohemian Rhapsody":
                switch(theatreType){
                    case"normal":
                        price = 7.35;
                        break;
                    case"luxury":
                        price = 9.45;
                        break;
                    case"ultra luxury":
                        price = 12.75;
                        break;
                }
                break;
            case "Green Book":
                switch(theatreType){
                    case"normal":
                        price = 8.15;
                        break;
                    case"luxury":
                        price = 10.25;
                        break;
                    case"ultra luxury":
                        price = 13.25;
                        break;
                }
                break;
            case"The Favourite":
                switch(theatreType){
                    case"normal":
                        price = 8.75;
                        break;
                    case"luxury":
                        price = 11.55;
                        break;
                    case"ultra luxury":
                        price = 13.95;
                        break;
                }
                break;
        }
        double sum = tickets*price;
        System.out.printf("%s -> %.2f lv.",movie,sum);

    }
}
