package Array;

import java.util.Scanner;

public class ArrayEx5 {
    public static void main(String[] args) {
        int[] arr = new int[6];
        int sum = 0;
        System.out.println();
        Scanner scanner = new Scanner(System.in);
        //Nhập
        for (int i = 0; i < arr.length; i++) {
            arr [i] = scanner.nextInt();
        }
        //Tính tổng

        for ( int i = 0; i < arr.length; i++){
            if ( arr[i]%2 != 0) continue;
//            if ( arr[i]%2 == 0){
                sum += arr[i];
//            }
        }
        //in ra
        System.out.println( sum );
    }
}
