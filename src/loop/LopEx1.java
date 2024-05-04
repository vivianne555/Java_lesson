package loop;

import java.util.Scanner;

//Display the First 10 Natural Numbers: Write a program in Java that displays the first 10 natural numbers. The expected output should be:
//        1 2 3 4 5 6 7 8 9 10
public class LopEx1 {
    public static void main(String[] args) {
        int i;
        int n;
        double sum = 0;
        Scanner scanner = new Scanner(System.in);
         n = scanner.nextInt();
//        System.out.print("10 số tự nhiên bao gồm " );
        for (i = 1; i <= n; i++) {
            if (i != 1) {
                System.out.print(" +");
            }
//                System.out.print(i);
             sum += 1.0 / i;
            System.out.print(" 1/" + i);
        }
        System.out.print("\n"); // để xuống dòng
        System.out.println( "tong = " + sum);
    }
}
