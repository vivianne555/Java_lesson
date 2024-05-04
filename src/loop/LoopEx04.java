package loop;

import java.util.Scanner;

//Write a java program to find sum of all odd numbers from 1 to n using for loop.
//Test Data:
//Input the number of terms: 10
//Expected Output:
//Sum of odd number between 1 to 10: 25
public class LoopEx04 {
    public static void main(String[] args) {
        int n;
        int sum = 0;
        Scanner scanner = new Scanner(System.in);
        n = scanner.nextInt();
        for ( int i =0; i <= n; i++){
            if ( i %2 != 0){
                sum = sum + i;
            }
        }
        System.out.println("Tổng số lẻ là: "+ sum);
    }
}
