package WhileLoop;
import java.util.Scanner;
public class VuongDangSo {
        public static void main(String[] args) {
            int n;
            Scanner scanner = new Scanner(System.in);
            n = scanner.nextInt();
            int i = 1;
            while (i <= n) {
                int j = 1;
                int num = i;
                while (j <= n) {
                    System.out.print(num + " ");
                    num++;
                    j++;
                }
                System.out.println();
                i++;
            }
        }
    }
