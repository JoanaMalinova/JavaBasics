package ConditionalStAdvPrActice;

import java.util.Scanner;

public class OperationsBetweenNums1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double num1 = Integer.parseInt(scanner.nextLine());
        double num2 = Integer.parseInt(scanner.nextLine());
        String operation = scanner.nextLine();
        double result = 0;
        switch(operation){
            case "+":
                result=num1+num2;
                break;
            case"-":
                result=num1-num2;
            case"*":
                result=num1*num2;
            case "/":
                result=num1/num2;
            case"%":
                result=num1%num2;
        }
        boolean isEven= result%2==0;
        if(isEven&&(operation.equals("+")||operation.equals("-")||operation.equals("*"))){
            System.out.printf("%.0f %s %.0f = %.0f - even",num1,operation,num2,result);
        }else if(!isEven&&(operation.equals("+")||operation.equals("-")||operation.equals("*"))){
            System.out.printf("%.0f %s %.0f = %.0f - odd",num1,operation,num2,result);
        }else if((operation.equals("/")||operation.equals("%"))&&num2==0){
            System.out.printf("Cannot divide %.0f by zero",num1);

        }else if(operation.equals("/")&&num2!=0){
            System.out.printf("%.0f / %.0f = %.2f",num1,num2,result);
        }else if(operation.equals("%")&&num2!=0){
            System.out.println(Math.round(num1)+" % "+Math.round(num2)+" = "+Math.round(result));
        }
    }
}
