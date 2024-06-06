import java.util.Scanner;

public class Execrise3 {
    public static void  main(String[] args){
        int a, b;
        int tong;
        int tich;
        int hieu;
        float thuong;
        Scanner c = new Scanner(System.in);
        a = c.nextInt();
        b = c.nextInt();
//        tong = a + b;
//        System.out.print("Tong la: " + tong);
//         tich = a * b;
//        hieu = a - b;
//        System.out.print( "Hieu la: " + hieu);
thuong = (float) a / b;
//        System.out.printf("%f",thuong);
        System.out.printf("%.10f", thuong);

    }
}

