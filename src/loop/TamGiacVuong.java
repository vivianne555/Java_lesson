package loop;
import java.util.Scanner;
public class TamGiacVuong {
//    public static void main(String[] args) {
//        int m;
//        int n;
//        int l = 1;
//        Scanner scanner = new Scanner(System.in);
//        m = scanner.nextInt(); // chiều rộng
//        n = scanner.nextInt(); // chiều dài
//        if ( m > n ){
//            l = m /n;
//        }
//        else if ( m > n ){
//            l = n/m;
//        }
//        for (int i = 0; i <= m; i++) {
//            for (int j = 0; j <= n; j++) {
//                if ( i <= l * j)
//                System.out.print("*");
//            }
//            System.out.println();
//        }
//    }
//}
public static void main(String[] args) {
        int n;
        int m;
        float l = 1;
        Scanner scanner = new Scanner(System.in);
        m = scanner.nextInt(); // m là chiều rộng
        n = scanner.nextInt(); // n là chiều dài
    if ( n < m) {
        l = (float)n / m;
    }
    else if (n > m) {
        l = (float) m / n;
    }
    for (int i = 0; i < m; i++) {
        for (int j = 0; j < n; j++) {
            if ( i <= l * j) {
                System.out.print("*");
            }
        }
        System.out.println();
    }
}
}