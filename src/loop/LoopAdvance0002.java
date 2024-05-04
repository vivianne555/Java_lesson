package loop;

import java.util.Scanner;

//Nhập 1 số n, m từ bàn phím in ra màn hình 1 hình chữ nhật có 2 cạnh rộng n, cạnh dài m (n dòng có độ dài m dấu “*”)
public class LoopAdvance0002 {
    public static void main(String[] args) {
        int n;
        int m;
        Scanner scanner = new Scanner(System.in);
        n = scanner.nextInt();
        m = scanner.nextInt();
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
