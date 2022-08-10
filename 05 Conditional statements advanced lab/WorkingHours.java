package ConditionalStatementsAdvanced;

import java.util.Scanner;

public class WorkingHours {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int hour = Integer.parseInt(scanner.nextLine());
        String dayOfWeek = scanner.nextLine();
        if(dayOfWeek.equals("Monday")&& hour>=10&& hour<18|| dayOfWeek.equals("Tuesday")&& hour>=10&& hour<18||dayOfWeek.equals("Wednesday")&& hour>=10&& hour<18||
                dayOfWeek.equals("Thursday")&& hour>=10&& hour<18||dayOfWeek.equals("Friday")&& hour>=10&& hour<18||dayOfWeek.equals("Saturday")&& hour>=10&& hour<18){
            System.out.println("open");
        }else {
            System.out.println("closed");
        }


    }
}
