package ExamPractice;

import java.util.Scanner;

public class SeriesCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String seriesName = scanner.nextLine();
        int seasonsNum = Integer.parseInt(scanner.nextLine());
        int episodes = Integer.parseInt(scanner.nextLine());
        double episodeTime = Double.parseDouble(scanner.nextLine());
        double extra = seasonsNum*10;
        double totalTime =Math.floor( seasonsNum*episodes*(episodeTime+0.2*episodeTime)+extra);
        System.out.printf("Total time needed to watch the %s series is %.0f minutes.",seriesName,totalTime);
    }
}
