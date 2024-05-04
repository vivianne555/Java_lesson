package WhileLoop;
import java.util.Scanner;
public class hinhchunhat {
        public static void main(String[] args) {
            int n;
            int m;
            Scanner scanner = new Scanner(System.in);
             n = scanner.nextInt();
             m = scanner.nextInt();
            int i = 0;
            while (i < n) {
                int j = 0;
                while (j < m) {
                    if (i == 0 || i == n - 1 || j == 0 || j == m - 1) {
                        System.out.print("* ");
                    } else {
                        System.out.print("  ");
                    }
                    j++;
                }
                System.out.println();
                i++;
            }
        }
    }
