package loop;

import java.util.Scanner;

//Nhập 1 số n từ bàn phím in ra màn hình 1 hình vuông có cạnh là n (n dòng có độ dài n dấu “*”)
public class LoopAvance003 {
    public static void main(String[] args) {
        int n;
        System.out.print(" Nhập n: ");
        Scanner scanner = new Scanner(System.in);
        n = scanner.nextInt();
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
