package WhileLoop;

import java.util.Scanner;

// Nhập vo n, in ra giai thừa của n
public class GiaiThua {
    public static void main(String[] args) {
        int n;
        Scanner scanner = new Scanner(System.in);
        n = scanner.nextInt();
        int i= 1;
        int ketQua = 1;
        while (i <= n){
            ketQua = ketQua * i;
            i++;
            System.out.print( ketQua + ",");
        }
        System.out.println();
        System.out.println( ketQua );
    }
}
