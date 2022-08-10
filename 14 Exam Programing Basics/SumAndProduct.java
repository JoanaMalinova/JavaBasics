package ExamProgramingBasics;

import java.util.Scanner;

public class SumAndProduct {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());
        boolean combinationFound = false;
        for (int a = 1; a <= 9; a++) {
            if(combinationFound){
                break;
            }
            for (int b = 9; b >= a; b--) {
                if (combinationFound){
                    break;
                }
                for (int c = 0; c <= 9; c++) {
                    if (combinationFound) {
                        break;
                    }
                    for (int d = 9; d >= c; d--) {
                        if (a + b + c + d == a * b * c * d && n % 5 == 0) {
                            System.out.printf("%d%d%d%d", a, b, c, d);
                            combinationFound = true;
                            break;
                        }else if (a + b + c + d !=0 && (a * b * c * d) / (a + b + c + d) == 3 && n % 3 == 0) {
                                System.out.printf("%d%d%d%d", d, c, b, a);
                                combinationFound = true;
                                break;

                        }

                    }

                }

            }
        }
        if(!combinationFound){
            System.out.println("Nothing found");
        }
    }
}
