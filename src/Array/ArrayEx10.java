package Array;
import java.util.Scanner;
public class ArrayEx10 {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);

            System.out.print("Nhập số lượng phần tử của mảng: ");
            int n = scanner.nextInt();

            double[] arr = new double[n];

            System.out.println("Nhập các phần tử của mảng:");
            for (int i = 0; i < n; i++) {
                arr[i] = scanner.nextDouble();
            }

            double sumOfPositive = 0;
            for (int i = 0; i < arr.length; i++) {
                if (arr[i] > 0) {
                    sumOfPositive += arr[i];
                } else {
                    arr[i] = 0; // Gán 0 cho các số âm
                }
            }

            System.out.println("Tổng các số dương trong mảng: " + sumOfPositive);

            System.out.println("Mảng sau khi xóa các số âm:");
            for (double num : arr) {
                System.out.print(num + " ");
            }
        }
    }
