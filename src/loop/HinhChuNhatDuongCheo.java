package loop;

import java.util.Scanner;

public class HinhChuNhatDuongCheo {
        public static void main(String[] args) {
            double n;
            double m;
            double l = 1;
            Scanner scanner = new Scanner(System.in);
            m = scanner.nextDouble(); // m là chiều rộng
            n = scanner.nextDouble(); // n là chiều dài
            if ( n < m) {
                l = n / m;
            }
            else if (n > m) {
                l = m / n;
            }
            for (double i = 0; i < n; i++) {
                for (double j = 0; j < m; j++) {
                    if ( i == 0 || i == n - 1 || j == 0 || j == m - 1 || i == l * j || j == i / l ) {
                        System.out.print("*");
                    } else {
                        System.out.print(" ");
                    }
                }
                System.out.println();
            }
        }
    }

