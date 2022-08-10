package FirstStepsPractical;

import java.util.Scanner;

public class ProjectsCreation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String name= scanner.nextLine();
        int num = Integer.parseInt(scanner.nextLine());
        int time =num*3;
        System.out.printf("The architect %s will need %d hours to complete %d project/s.",name, time, num);
    }
}
