package Array;

import java.util.Scanner;

public class arrayFor {
    public static void main(String[] args) {
        int [] arr = new int[10];
        Scanner scanner = new Scanner(System.in);
        for (int i = 0; i < arr.length; i++) {
            arr[i] = scanner.nextInt();
        }
        for ( int i = 0; i < arr.length; i++){
            System.out.print( arr[i]);
        }
    }
}
