package Array;
import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;
public class Array7 {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);

            System.out.print("Nhập các phần tử của mảng, cách nhau bởi dấu phẩy: ");
            String input = scanner.nextLine();

            String[] inputArray = input.split(",");
            Integer[] arr = new Integer[inputArray.length];
            for (int i = 0; i < inputArray.length; i++) {
                arr[i] = Integer.parseInt(inputArray[i].trim());
            }

            Arrays.sort(arr, Collections.reverseOrder());

            System.out.println("\nMảng sau khi sắp xếp giảm dần:");
            for (int num : arr) {
                System.out.print(num + " ");
            }
        }
    }

