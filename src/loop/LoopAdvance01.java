package loop;

import java.util.Scanner;

public class LoopAdvance01 {
    public static void main(String[] args) {
        int n;
        Scanner scanner = new Scanner(System.in);
        n = scanner.nextInt();
        for( int j = 1; j <= 3; j++) {
//            System.out.print("*");
            for( int i = 0; i < n; i++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
