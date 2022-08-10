package FirstStepsPractical;

import java.util.Scanner;

public class ExtraWeatherForecastPart2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double weather = Double.parseDouble(scanner.nextLine());
        if(weather<5){
            System.out.println("unknown");
        }else if (weather<12){
            System.out.println("Cold");
        }else if (weather<15){
            System.out.println("Cool");
        }else if(weather<20.1) {
            System.out.println("Mild");
        }else if (weather<26)  {
            System.out.println("Warm");
        }else if (weather<=35) {
            System.out.println("Hot");
        }else{
            System.out.println("unknown");
        }
    }
}
