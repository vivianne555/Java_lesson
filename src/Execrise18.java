import java.util.Scanner;

//B1 Nhập vào 2 số  a.b
//        Chị nhập biểu thức +, -, *, /
//        vd: a= 4, b =5, bieur thức * => in ra  20
//        a = 3, b =4 biểu thức + => in ra 7
//import java.util.Scanner;
//public class Execrise18 {
//    public static void main(String[] args) {
//        double a,b;
//        Scanner scanner = new Scanner(System.in);
//        a = scanner.nextDouble();
//        b = scanner.nextDouble();
//        double x= a+b;
//
//    }
//
//
//}
public class Execrise18 {
    public static void main(String[] args) {
        int i;
        int n;
        Scanner scanner = new Scanner(System.in);
        n = scanner.nextInt();
        if(n > 0) {
            for (i = 0; i < n; i++) {
                System.out.println(i);
            }
        }
        else{
                System.out.println("Invalid! ");
            }
            }
        }
