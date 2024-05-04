//Bài 1
//        Viết chương trình giải phương trình bậc hai, cho phép người dùng nhập vào giá trị a , b , c . Gợi ý:
//        Phương trình bậc 2 có dạng:
//        Cách giải:
//        - Bước 1: Tính
//        - Bước 2: Kiểm tra điều kiện
//        Nếu delta < 0 thìphươngtrìnhvônghiệm
//        Nếu delta = 0 thìphươngtrìnhcónghiệmkép . Nếu delta > 0 thìphươngtrìnhcó2nghiệmphânbiệt
//        .

import java.util.Scanner;

public class Execrise20 {
    public static void main(String[] args) {
        int a;
        int b;
        int c;
        a = 5;
        b = 6;
        c = 7;
        Scanner scanner = new Scanner(System.in);
        double ln = scanner.nextDouble();
        double delta = b * b - 4 * a * c;
        if (delta > 0){
            double x1 = (-b - Math.sqrt(delta))/ 2*a;
            double x2 = (-b - Math.sqrt(delta))/2*a;
            System.out.println("Phương trình có 2 nghiệm");
            System.out.println("x1 =" + x1);
            System.out.println("x2 =" + x2);
        }
        else if( delta == 0){
            double x = -b/(2*a);
            System.out.println("Phương trình có nghiệm ");
            System.out.println("x=" + x);
        }
        else{
            System.out.println("Phương trình vô nghiệm");
        }

    }
}
