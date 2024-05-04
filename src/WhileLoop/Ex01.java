package WhileLoop;

import java.util.Scanner;

// in các số ừ 0 tới n
public class Ex01 {
    public static void main(String[] args) {
        int n;
        Scanner scanner = new Scanner(System.in);
        n = scanner.nextInt();
        int i = 0;
        while ( i <= n ){
            if (i == n){
                System.out.print( i + ".");
            }
            else {
                System.out.print(i + ",");
            }
            i++;
        }
    }

}
