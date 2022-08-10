package WhileLoopLab;

import java.util.Scanner;

public class Graduation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String name = scanner.nextLine();
        int classNum = 1;
        int badGrade = 0;
        double totalGrade = 0;
        boolean isExcluded = false;
        while(classNum<=12) {
           double grade = Double.parseDouble(scanner.nextLine());
           if (grade < 4){
               badGrade +=1;
               if(badGrade==2){
                   System.out.printf("%s has been excluded at %d grade",name,classNum);
                   isExcluded = true;
                   break;
               }
               continue;
           }
           classNum += 1;
           totalGrade += grade;

           }
        if(!isExcluded) {
            double averageGrade = totalGrade / 12;
            System.out.printf("%s graduated. Average grade: %.2f", name, averageGrade);

        }

    }
}
