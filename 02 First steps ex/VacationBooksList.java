package FirstStepsPractical;

import java.util.Scanner;

public class VacationBooksList {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int totalPages = Integer.parseInt(scanner.nextLine());
        int pagePerHour = Integer.parseInt(scanner.nextLine());
        int days = Integer.parseInt(scanner.nextLine());
        int time = totalPages/ pagePerHour;
        int hoursPerDay = time/ days;
        System.out.println(hoursPerDay);
    }
}
