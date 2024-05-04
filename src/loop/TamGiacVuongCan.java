package loop;

import java.util.Scanner;

public class TamGiacVuongCan {
    public static void main(String[] args) {
        int n;
        Scanner scanner = new Scanner(System.in);
        n = scanner.nextInt();
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (j <= i) {
                    System.out.print("*");
                }
            }
            System.out.println();
        }
    }
}
