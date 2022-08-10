package ExamPractice;

import java.util.Scanner;

public class MovieRatings {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());
        double totalRating = 0;
        double highest = Integer.MIN_VALUE;
        double lowest = Integer.MAX_VALUE;
        String low = "";
        String high = "";
        for (int i = 1; i <= n ; i++) {
            String movie = scanner.nextLine();
            double rating = Double.parseDouble(scanner.nextLine());;
            totalRating += rating;
            if (rating > highest){
                highest = rating;
                high = movie;

            }
            if (rating < lowest){
                lowest = rating;
                low = movie;

                 ;
            }
        }
        double average = totalRating/n;
        System.out.printf("%s is with highest rating: %.1f%n",high,highest);
        System.out.printf("%s is with lowest rating: %.1f%n",low,lowest);
        System.out.printf("Average rating: %.1f",average);
    }
}
