package loop;

import java.util.Scanner;

// in ra 1 hình chữ nhật rỗng có chiều cao là m, chiều rộng là n bằng dấu *
public class HinhChuNhatRong {
    public static void main(String[] args) {
        int n;
        int m;
        Scanner scanner = new Scanner(System.in);
        n = scanner.nextInt();
        m = scanner.nextInt();
        for( int i =0; i < n; i++){
            for ( int j = 0; j <n; j++){
                if (i==0 || j == 0 || i == (n-1) || j == (n-1)){
                    System.out.print("*");
                }
                else{
                    System.out.print( " ");
                }
            }
            System.out.println();
        }
    }
}
