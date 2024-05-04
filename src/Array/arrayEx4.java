package Array;

import java.util.Scanner;

public class arrayEx4 {
    public static void main(String[] args) {
        int [] arr = { 2,3,4,5,6,7,8};
        int  number;
        Scanner scanner = new Scanner(System.in);
        number = scanner.nextInt();
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == number) {
                System.out.println( i + 1 );
            }
        }
    }
}
