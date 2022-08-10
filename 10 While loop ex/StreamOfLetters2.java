package WhileLoopPractice;

import java.util.Scanner;

public class StreamOfLetters2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String end = scanner.nextLine();
        int os = 0;
        int cs = 0;
        int ns = 0;
        String word = "";
        while (!end.equals("End")) {
            while (!(ns >=1 && os >=1 && cs>=1)&&!end.equals("End")) {
                char letter = end.charAt(0);
                if (letter<65||(letter>90&&letter<97)||letter>122){
                    end = scanner.nextLine();
                    continue;
                }
                switch (letter) {
                    case 'o':
                        os++;
                        if (os == 1) {
                            end = scanner.nextLine();
                            continue;
                        } else {
                            break;
                        }

                    case 'c':
                        cs++;
                        if (cs == 1) {
                            end = scanner.nextLine();
                            continue;

                        } else {
                            break;
                        }

                    case 'n':
                        ns++;
                        if (ns == 1) {
                            end = scanner.nextLine();
                            continue;
                        } else {
                            break;
                        }
                }
                word += letter;
                end = scanner.nextLine();


            }
            if (ns >=1 && os >=1 && cs >=1){
            System.out.print(word + " ");
            ns = 0;
            cs = 0;
            os = 0;
            word = "";
            }

        }

    }
}
