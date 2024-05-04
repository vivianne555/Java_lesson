package Array;

import java.util.Scanner;

public class bubbleSort {
    public static void main(String[] args) {
        int[] arr = new int[4];
        Scanner scanner = new Scanner(System.in);
        for ( int i= 0; i < arr.length; i++) {
            arr[i] = scanner.nextInt();
        }
        for (int i = 0; i < arr.length; i++){
            for ( int j = i +1 ; j < arr.length; j ++){
                if (arr[i] > arr[j]){
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j]= temp;
                }
            }
        }
        for (int i=0; i < arr.length; i++){
            System.out.println( arr[i]);
        }

    }
}
