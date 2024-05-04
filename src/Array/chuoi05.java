//Nhập vào 2 chuỗi từ bàn phím,
// tìm xem nội dung chuỗi thứ 2 có xuất hiện trong chuôi thứ 1 hay không, nếu có in ra vị trí xuất hiện trong chuỗi 1.
package Array;
import java.util.Scanner;
public class chuoi05 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Nhập chuỗi thứ nhất: ");
        String str1 = scanner.nextLine();

        System.out.print("Nhập chuỗi thứ hai: ");
        String str2 = scanner.nextLine();

        int index = str1.indexOf(str2);

        if (index != -1) {
            System.out.println("Chuỗi thứ hai xuất hiện trong chuỗi thứ nhất tại vị trí " + index);
        } else {
            System.out.println("Chuỗi thứ hai không xuất hiện trong chuỗi thứ nhất.");
        }
    }
}
