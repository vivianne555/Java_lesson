//Nhập 1 mảng n số tự nhiên từ bàn phím ( n cũng được nhập từ bàn phím) . Tính tổng n
//phần tử, in ra phần tử lớn nhất và nhỏ nhất trong dãy.
package Array;
import java.util.Scanner;
public class mang01 {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            System.out.print("Nhập kích thước của mảng: ");
            int n = scanner.nextInt();
            int[] array = new int[n];


            System.out.println("Nhập các phần tử của mảng:");
            for (int i = 0; i < n; i++) {
                array[i] = scanner.nextInt();
            }

            int sum = 0;
            for (int i = 0; i < n; i++) {
                sum += array[i];
            }

            int max = array[0];
            int min = array[0];
            for (int i = 1; i < n; i++) {
                if (array[i] > max) {
                    max = array[i];
                }
                if (array[i] < min) {
                    min = array[i];
                }
            }

            System.out.println("Tổng các phần tử trong mảng: " + sum);
            System.out.println("Phần tử lớn nhất trong mảng: " + max);
            System.out.println("Phần tử nhỏ nhất trong mảng: " + min);

        }
    }
