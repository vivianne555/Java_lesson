import java.util.Scanner;

//import java.util.Scanner;
////
////Tính tổng 0=> n
////        n = 3=> in 6
////        n = 3 in 3 = 2+ 1+0
//public class Execrise19 {
//    public static void main(String[] args) {
//        int i;
//        int n;
//        int Sum = 0;
//        Scanner scanner = new Scanner(System.in);
//        n = scanner.nextInt();
//        for (i = 0;i < n; i++) {
//            Sum = Sum + i ;
//        }
//        System.out.println(Sum);
//
//    }
//}
//Nhập 1 số n tính giai thừa của n
public class Execrise19 {
    public static void main(String[] args) {
        int i;
        int n;
        int Cross= 1;
        Scanner scanner = new Scanner(System.in);
        n = scanner.nextInt();
        for (i = 1; i <= n; i++) {
            Cross = Cross * i;
        }
        System.out.println(Cross);
    }
}