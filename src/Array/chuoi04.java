//Nhập vào 1 chuỗi bất kì từ bàn phím, đếm số từ xuất hiện trong chuỗi.
package Array;
import java.util.Scanner;
public class chuoi04 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập một chuỗi bất kỳ: ");
        String input = scanner.nextLine();


        String[] words = input.trim().split("\\s+");

        int wordCount = words.length;

        System.out.println("Số từ xuất hiện trong chuỗi là: " + wordCount);

    }
}
