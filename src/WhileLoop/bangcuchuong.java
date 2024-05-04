package WhileLoop;
import java.util.Scanner;
public class bangcuchuong {
        public static void main(String[] args) {
            int n;
            Scanner scanner = new Scanner(System.in);
            n = scanner.nextInt();
            System.out.println("Bảng cửu chương của " + n + ":");
            int i = 1;
            while (i <= 10) {
                System.out.println( n + " x " + i + " = " + ( n * i));
                i++;
            }
        }
    }
