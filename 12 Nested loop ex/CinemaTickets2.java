package NestedLoopPr;

import java.util.Scanner;

public class CinemaTickets2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String movie = scanner.nextLine();
        int student =0;
        int standard = 0;
        int kid = 0;
        int counter = 0;
        int totalSeats = 0;
        String currentMovie = "";
        while (!movie.equals("Finish")) {
            currentMovie = movie;
            int seats = Integer.parseInt(scanner.nextLine());
            String command = scanner.nextLine();
            while(!command.equals("End") ) {
                counter++;

                switch (command) {
                    case "student":
                        student++;
                        break;
                    case "standard":
                        standard++;
                        break;
                    case "kid":
                        kid++;
                        break;
                }
                if(counter == seats ){
                    break;
                }
                command = scanner.nextLine();

            }
            totalSeats += counter;
            System.out.printf("%s - %.2f%% full.%n",currentMovie,counter * 100.0 / seats );
            counter = 0;
            movie = scanner.nextLine();
        }
        System.out.printf("Total tickets: %d%n",totalSeats);
        System.out.printf("%.2f%% student tickets.%n",student*100.0/totalSeats);
        System.out.printf("%.2f%% standard tickets.%n",standard*100.0/totalSeats);
        System.out.printf("%.2f%% kids tickets.",kid*100.0/totalSeats);
    }
}
