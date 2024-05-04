package WhileLoop;
import java.util.Scanner;
public class TamGiacCan {
        public static void main(String[] args) {
            int n;
            Scanner scanner = new Scanner(System.in);
            n = scanner.nextInt();

            // Vẽ tam giác cân
            for (int i = 1; i <= n; i++) {
                // In khoảng trắng để dịch chuyển tam giác sang phải
                for (int j = 1; j <= n - i; j++) {
                    System.out.print(" ");
                }
                for (int j = 1; j <= 2 * i - 1; j++) {
                    System.out.print("*");
                }
                System.out.println();
            }
        }
}
//Code này đi hỏi các anh trong team