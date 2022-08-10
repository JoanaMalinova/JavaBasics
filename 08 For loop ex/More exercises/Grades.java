package ForLoopPr;

import java.util.Scanner;

public class Grades {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int students = Integer.parseInt(scanner.nextLine());
        int top = 0;
        int student4 =0;
        int students3 = 0;
        int fail = 0;
        double totalGrade=0;
        for(int i =1;i<=students;i++){
            double grade = Double.parseDouble(scanner.nextLine());
            if(grade<=2.99){
                totalGrade+=grade;
                fail+=1;
            }else if(grade<=3.99){
                students3+=1;
                totalGrade+=grade;

            }else if(grade<=4.99){
                student4+=1;
                totalGrade+=grade;

            }else{
                top+=1;
                totalGrade+=grade;
            }
        }
        double average = totalGrade/students;
        double topPercent = top*100.0/students;
        double failPercent = fail*100.0/students;
        double student3Percent = students3*100.0/students;
        double students4Percent = student4*100.0/students;
        System.out.printf("Top students: %.2f%%%n",topPercent);
        System.out.printf("Between 4.00 and 4.99: %.2f%%%n",students4Percent);
        System.out.printf("Between 3.00 and 3.99: %.2f%%%n",student3Percent);
        System.out.printf("Fail: %.2f%%%n",failPercent);
        System.out.printf("Average: %.2f",average);
    }
}
