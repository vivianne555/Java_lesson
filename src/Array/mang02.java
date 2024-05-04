///Tạo 1 mảng số tự nhiên ngẫu nhiên n phần tử với n nhập vào từ bàn phím. Sắp xếp dẫy theo thứ tự tăng dần và hiển thị.
package Array;
import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;
public class mang02 {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            Random random = new Random();

            System.out.print("Nhập kích thước của mảng: ");
            int n = scanner.nextInt();

            int[] array = new int[n];
            for (int i = 0; i < n; i++) {
                array[i] = random.nextInt(100);
            }

            Arrays.sort(array);
            System.out.println("Mảng đã sắp xếp theo thứ tự tăng dần:");
            for (int i = 0; i < n; i++) {
                System.out.print(array[i] + " ");
            }
        }
    }