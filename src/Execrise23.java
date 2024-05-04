import org.w3c.dom.ls.LSOutput;

import java.util.Scanner;

// Nhập n là số nguyên từ bàn phím, tính tổng 1 tới n
public class Execrise23 {
    public static void main(String[] args) {
        int n;
        Scanner scanner = new Scanner(System.in);
        n = scanner.nextInt();
        // i là biến để duy trì bước nhảy
        // khai báo biến i ngay trong vòng lặp ở phần KHỞI TẠO ( Ex: int i= 1)
        // kHỞI TẠO, ĐIỀU KIỆN, BƯỚC NHẢY (int i = 1; n < (i +1); i++ )
        int c = 0;
        for (int i = 1; i < (n + 1); i++) {
//            System.out.println(i);
            c = c + i;
        }
        System.out.println(c);
    }
}
