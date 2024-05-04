package Array;

import java.util.Scanner;

public class llllll {
    public static void main(String[] args) {
        int x = 0;
        Scanner sc = new Scanner(System.in);
        x = sc.nextInt();
        for(int i =0; i<1095; i++){
            x += 0.00015*x;
        }
        System.out.println(x);
    }
}
