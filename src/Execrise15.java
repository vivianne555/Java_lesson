public class Execrise15 {
    public static void main(String[] args) {
        int year = 2004; // Input year

        if ((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0)) {
            System.out.println(year + " là năm nhuận");
        } else {
            System.out.println(year + " không phải năm nhuận");
        }
    }
}
