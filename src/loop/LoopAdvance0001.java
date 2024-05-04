package loop;

import java.util.Scanner;

public class LoopAdvance0001 {
    public static void main(String[] args) {
        int n;
        System.out.print("Nhập n:");
        Scanner scanner = new Scanner(System.in);
        n = scanner.nextInt();
        for (int i = 0; i < n; i++ ) {
            for (int j = 0; j < n; j++) {
                System.out.print( "*");
            }
            System.out.println();
        }
    }
}
