package ForLoopPr;

public class Clock2 {
    public static void main(String[] args) {
        for (int i = 0; i < 24; i++) {
            for(int i1=0; i1<60; i1++){
                for(int i2 =0; i2<60; i2++){
                    System.out.println(i+" : "+i1+" : "+i2);
                }
            }

        }
    }
}
