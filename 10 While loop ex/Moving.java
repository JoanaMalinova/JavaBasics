package WhileLoopPractice;

import java.util.Scanner;

public class Moving {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int widthFree = Integer.parseInt(scanner.nextLine());
        int lengthFree = Integer.parseInt(scanner.nextLine());
        int heightFree = Integer.parseInt(scanner.nextLine());
        int freeSpace = widthFree*lengthFree*heightFree;
        int boxedSpace = 0;
        int diff = 0;
        boolean leftSpace = true;
        String done = scanner.nextLine();
        while(!done.equals("Done")) {
            int boxes = Integer.parseInt(done);
            boxedSpace += boxes;
            diff =Math.abs(freeSpace - boxedSpace);
            if(boxedSpace>=freeSpace){
                leftSpace = false;
                System.out.printf("No more free space! You need %d Cubic meters more.",diff);
                break;
            }
            done = scanner.nextLine();
        }
        if(diff>0 && leftSpace){
            System.out.printf("%d Cubic meters left.",diff);
        }
    }
}
