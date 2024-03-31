//import java.util.Scanner;
//
//public class Main {
//    public static void main(String[] args) {
//        int c;
//        Scanner input = new Scanner(System.in);
//        c= input.nextInt();
//        int d= 1- c%2;
//        System.out.print(d);
//
//    }
//}

// tính ổng
//main là 1 hàm để chạy, nên mình đặt class là main

import java.util.Scanner;

public class Main {
    //    define dòng code cần chạy.
    public static void main(String[] args) {
        Scanner c = new Scanner(System.in);
//    khai báo biến, int là data type, int= interger; float= số thực(real); char= character(a,b,v..), string: chuỗi và không phải kiểu dữ liệu nguyên thủy, string là object("tuyết cận"),
//    String tuyetCan= "Tuyet can";
//    String xinhDep = "Xinh dep";
        int a, b;
        int tong;
// cách 1: nhập a,b => 1.import Java.util.Scanner (trong java 1 scanner là 1 thư viện, nó có sẵn nhiều phần xử lý để mình có thể tương tác với máy tính, họ gói gọn trong thư viện rồi nên cần dùng thì import vào và lấy đối tượng, lấy class có sẵn trong thư viện để sử dụng
//    2. làm như bth
//    3. gọi sannerr, khai báo đối tượng tên là scanner/fff tùy, gán địa chỉ để nó có vùng nhớ trên RAM, để gọi thì nó chạy được. scanner sẽ nhận thông tin đầu vào
//     ví dụ Scanner scanner = new Scanner(System.in);
//    nextint là gì? đối tượng.nextint là mình gọi đến hàm nextint để nhập 1 gtri số nguyên từ bàn phím ra
//    gán gtri vào biến ví dụ a = scanner(đối tượng). nextInt(gọi đến hàm nextIn để nhập gtri số nguyên) ()
        a = c.nextInt();
        b = c.nextInt();
//    Scanner scanner = new Scanner(System.in);
//Logic/ công thức
        tong = a + b;
//in ra kết quả mong muốn
        System.out.print("Tổng là:" + tong);
    }
}
