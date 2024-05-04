package Array;
import java.util.Scanner;
public class ArrayEx11 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double[] arr = new double[10];
        int size = 0;
        while (true) {
            String input = scanner.next();
            if (input.equals("done")) {
                break;
            }
            double sumOfPositive = 0;
            for (int i = 0; i < size; i++) {
                if (arr[i] > 0) {
                    sumOfPositive += arr[i];
                }
            }
            System.out.println("Tổng các số dương trong mảng: " + sumOfPositive);
        }
    }
}