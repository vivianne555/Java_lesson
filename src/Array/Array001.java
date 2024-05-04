package Array;
import java.util.Scanner;

public class Array001 {
    public static void main(String[] args) {
        int[] arr = new int[5];

        Scanner scanner = new Scanner(System.in);
        for (int i = 0; i < arr.length; i++) {
            arr[i] = scanner.nextInt();
        }

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % 2 == 0) {
                System.out.println(arr[i] + " ");
            }
        }
    }

    private static int[] nhapHam() {
        int[] arr = new int[5];
        Scanner scanner = new Scanner(System.in);
        for (int i = 0; i < arr.length; i++) {
            arr[i] = scanner.nextInt();
        }
        return arr;
    }
    private static void inSoChan ( int[] arr){
        for ( int i = 0; i < arr.length; i++){
            if (arr[i] % 2 == 0)
        }
    }
}
