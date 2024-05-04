package JavaMethod;

public class New01 {
    public static void main(String[] args) {
        for (int i = 1; i < 10; i++) {
            if (isEven(i)){
                System.out.println(i + " là số lẻ");
            }
            if (isOdd(i)){
                System.out.println(i + " là số chắn");
            }
        }

    }
    private static boolean isEven(int num) {
        if (num % 2 != 0)
            return true;
        else
            return false;
}
private static boolean isOdd( int num1){
        if (num1 % 2 == 0)
            return true;
        else
            return false;

}
}