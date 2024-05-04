package loop;

import java.util.Scanner;

// tính hiệu các số từ 1 tới n
public class LoopFor02 {
    public static void main(String[] args) {
        int n;
        int hieu = -10;
        Scanner scanner = new Scanner(System.in);
        n = scanner.nextInt();
        for (int i = 1; i < n; i++){
        hieu = hieu - i;
        }
        System.out.println(hieu);
    }
}
