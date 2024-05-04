package loop;

import java.util.Scanner;

public class TamGiac01 {
    public static void main(String[] args) {
        int n = 5; // Số hàng của tam giác

        // Vòng lặp ngoài để in xuống dòng
        for (int i = 1; i <= n; i++) {
            // Vòng lặp bên trong để in các ký tự *
            for (int j = 1; j <= n - i; j++) {
                System.out.print(" "); // In khoảng trắng
            }
            for (int k = 1; k <= 2 * i - 1; k++) {
                System.out.print("*"); // In các ký tự *
            }
            System.out.println(); // Xuống dòng
        }
    }
}