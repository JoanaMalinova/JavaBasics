package ExamPractice;

import java.util.Scanner;

public class TravelAgency {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String town = scanner.nextLine();
        String packetType = scanner.nextLine();
        String vipYesNo = scanner.nextLine();
        int daysStay = Integer.parseInt(scanner.nextLine());
        double price = 0;
        double vip =0;
        double totalPrice = 0;
        switch(town){
            case "Borovets":
            case "Bansko":
                switch(packetType){
                    case"withEquipment":
                        price = 100;
                        vip = 10;

                        break;
                    case"noEquipment":
                        vip= 5;
                        price = 80;
                        break;
                }
                break;
            case "Varna":
            case "Burgas":
                switch(packetType){
                    case "noBreakfast":
                        price= 100;
                        vip= 7;
                        break;
                    case "withBreakfast":
                        price = 130;
                        vip = 12;
                        break;
                }
                break;
                }
                if(daysStay>7) {
                    totalPrice=price*(daysStay-1);

                }else {
                    totalPrice=price*daysStay;
                }

        switch(vipYesNo) {
            case "yes":
                totalPrice -= totalPrice * vip / 100;
                break;
                }
                if((!town.equals("Borovets")&&!town.equals("Bansko")&&!town.equals("Varna")&&!town.equals("Burgas"))
                ||(!packetType.equals("noEquipment")&& !packetType.equals("withEquipment") &&
                        !packetType.equals("noBreakfast")&&!packetType.equals("withBreakfast"))){
                    System.out.println("Invalid input!");
                }else if(daysStay<1){
                    System.out.println("Days must be positive number!");
                }else{
                    System.out.printf("The price is %.2flv! Have a nice time!",totalPrice);
                }







        }
    }

