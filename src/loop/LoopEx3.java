package loop;

import java.util.Scanner;

//Write a Java program to input number from user and find sum of all even numbers between 1 to n.
//Test Data:
//Input the number of terms: 10
//Expected Output:
//Sum of even number between 1 to 10: 30
//tips: B1: Nhập n từ bàn phím;
// B2: lặp 1 tới n,
// B3: if i chia hết cho 2 hay không,
// B4: ktra, nếu chia hết thì cộng vo biến tổng
// B5: in ra
public class LoopEx3 {
    public static void main(String[] args) {
        int n;
        int sum = 0;
        Scanner scanner = new Scanner(System.in);
        n = scanner.nextInt();
        for ( int i = 0; i <= n; i++){
            if(i %2 == 0){
                System.out.println( i);
                sum = sum + i;
            }
        }
        System.out.println( "tổng là :" + sum);
    }
}
