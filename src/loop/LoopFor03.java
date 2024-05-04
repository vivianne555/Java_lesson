package loop;

import java.util.Scanner;

// nhập 1 số n, in ra n dấu *
public class LoopFor03 {
    public static void main(String[] args) {
        while (true) {
            int n;
            Scanner scanner = new Scanner(System.in);
            n = scanner.nextInt();
            for (int i = 0; i < n; i++) {
                System.out.print("*");
            }
        }
    }
}
