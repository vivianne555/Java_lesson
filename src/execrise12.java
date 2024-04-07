public class execrise12 {
    // Cho 3 số a,b,c tìm số lớn nhất
    public static void main(String[] args) {
        int a,b,c;
        a= 3;
        b= 3;
        c= 3;
        if (a > b && a > c) {
            System.out.println("a là số lớn nhất");
        }
        else if (b > c && b > a) {
            System.out.println(" b là số lớn nhất");
        }
        else if ( c > a && c > b) {
            System.out.println(" c là số lớn nhất");
        }
        else{
            System.out.println("giá trị không hợp lệ");
        }
        }
    }
