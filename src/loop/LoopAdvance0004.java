package loop;

import java.util.Scanner;

//Nhập 1 số n từ bàn phím in ra màn hình 1 hình vuông có cạnh là n với các số tự nhiên tăng dần từ trái qua phải trên các hàng
public class LoopAdvance0004 {
    public static void main(String[] args) {
        int n;
        int m = 1;
        Scanner scanner = new Scanner(System.in);
        n = scanner.nextInt();
        for( int i =0; i < n; i++){
            for ( int j =0; j < n; j++){
                System.out.print(m + " ");
                m = m + 1;
            }
            System.out.println();
        }
    }
}
