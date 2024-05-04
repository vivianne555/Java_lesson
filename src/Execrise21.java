//Viết chương trình kiểm tra số n có phải là số nguyên tố hay không?
// 2. Viết chương trình in ra 10 số nguyên tố đầu tiên;
import java.util.Scanner;
public class Execrise21 {
    public static void main(String[] args) {
        System.out.print("Input: ");
        double n;
        Scanner scanner = new Scanner(System.in);
        n = scanner.nextDouble();
        System.out.println();
        if(n % n == 1) {
            System.out.println(" n là số nguyên tố");
        }
        else{
                System.out.println("n không phải là số nguyên tố ");

        }
    }
}
