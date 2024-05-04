package Array;
import java.util.Scanner;
import java.util.Arrays;
public class ArrayEx6 {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            int n;
            n = scanner.nextInt();

            int[] arr = new int[n];
            System.out.println("Nhập giá trị cho từng phần tử trong mảng:");
            for (int i = 0; i < n; i++) {
                System.out.print("Nhập phần tử thứ " + (i + 1) + ": ");
                arr[i] = scanner.nextInt();
            }

            Arrays.sort(arr);
            System.out.println("\nMảng sau khi sắp xếp tăng dần:");
            for (int num : arr) {
                System.out.print(num + " ");
            }
        }
    }
