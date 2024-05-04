package loop;

import java.util.Scanner;

//in ra hình tam giác vuông cân cạnh n
public class PractiseTGV {
    public static void main(String[] args) {
        int n;
        Scanner scanner = new Scanner(System.in);
        n = scanner.nextInt();
        for ( int i = 0; i < n; i++){
            for( int j = 0; j < n; j++){
                if ( i <= j){
                    System.out.print("*");
                }
            }
            System.out.println();
        }
    }
}
