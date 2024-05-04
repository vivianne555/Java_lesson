package Array;
import java.util.Scanner;
public class ArrayEx8 {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);

            System.out.print("Nhập các phần tử của mảng, cách nhau bởi dấu phẩy: ");
            String input = scanner.nextLine();

            String[] inputArray = input.split(",");
            int[] arr = new int[inputArray.length];
            for (int i = 0; i < inputArray.length; i++) {
                arr[i] = Integer.parseInt(inputArray[i].trim());
            }

            System.out.println("Các số nguyên tố trong mảng và vị trí của chúng:");
            for (int i = 0; i < arr.length; i++) {
                if (isPrime(arr[i]) == 1) {
                    System.out.println("Số " + arr[i] + " ở vị trí " + i);
                }
            }
        }
        public static int isPrime(int num) {
            if (num <= 1) {
                return 0;
            }
            for (int i = 2; i * i <= num; i++) {
                if (num % i == 0) {
                    return 0;
                }
            }
            return 1;
        }
    }

