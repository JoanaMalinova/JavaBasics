package ExamPractice;

import java.util.Scanner;

public class FitnessCenter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());
        int back = 0;
        int chest = 0;
        int legs = 0;
        int abs = 0;
        int proteinShake = 0;
        int proteinBar = 0;
        for (int i = 1; i <=n ; i++) {
            String activity = scanner.nextLine();
            switch (activity) {
                case"Back":
                    back += 1;
                    break;
                case"Chest":
                    chest += 1;
                    break;
                case"Legs":
                    legs +=1;
                    break;
                case"Abs":
                    abs += 1;
                    break;
                case"Protein shake":
                    proteinShake += 1;
                    break;
                case"Protein bar":
                    proteinBar += 1;
                    break;
            }

        }
        int workout = back + chest + legs +abs;
        int protein = proteinBar + proteinShake;
        int all = workout + protein;
        System.out.printf("%d - back%n%d - chest%n%d - legs%n%d - abs%n%d - protein shake%n%d - protein bar%n",back,chest,legs,abs,proteinShake,proteinBar);
        System.out.printf("%.2f%% - work out%n%.2f%% - protein",workout*100.0/all,protein*100.0/all);
    }
}
