package CoditionalStPractical;

import java.util.Scanner;

public class ExtraFuelTank {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String fuelType = scanner.nextLine();
        int fuelLtr = Integer.parseInt(scanner.nextLine());

        if(fuelType.equals("Diesel")){
            if(fuelLtr>=25) {
                System.out.println("You have enough diesel.");
            }else {
                System.out.println("Fill your tank with diesel!");
            }
        }else if(fuelType.equals("Gasoline")){
            if(fuelLtr>=25) {
                    System.out.println("You have enough gasoline.");
                }else {
                System.out.println("Fill your tank with gasoline!" );
            }

        }else if(fuelType.equals("Gas")) {
            if(fuelLtr>=25){
                        System.out.println("You have enough gas.");
                    }else {
                System.out.println("Fill your tank with gas!");
            }
        }else {
            System.out.println("Invalid fuel!");
        }

        }

    }

