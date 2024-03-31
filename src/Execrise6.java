import java.util.Scanner;

public class Execrise6 {
    public static void main(String[] args) {
        double r;
        Scanner sc = new Scanner(System.in);
        r = sc.nextInt();
        r = Math.pow(r, 2);
        System.out.println("Diện tích hình tròn= " + (r* Math.PI));
    }
}
