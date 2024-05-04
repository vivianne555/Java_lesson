package loop;

import java.util.Scanner;

// cộng các số từ 1 tới n+2
public class LoopFor01 {
    public static void main(String[] args) {
        int n;
        int tong = 0;
        Scanner scanner = new Scanner(System.in);
        n = scanner.nextInt();
        for (int i = 1; i < (n + 2); i++){
            tong = tong + i;
        }
        System.out.println(tong);
    }
    
}
