package JavaMethod;
import java.util.Scanner;
//Nhập vào 1 mảng, sắp xếp, và in ra
public class Method01 {
    public static void main(String[] args) {
        int a[];
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhap mang: ");
        int n = scanner.nextInt();
        a = new int[n];
    }
    static void nhapMang(int[] array) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap do dai mang ");
        int m = sc.nextInt();
        for (int i = 0; i < m; i++) {
            array[i] = sc.nextInt();
        }
    }
    static void sapXep(int[] array){
        for ( int i = 0; i < array.length; i++){
            for ( int j = i +1; j < array.length; j++){
                if ( array[i] > array[j]){
                    int temp = array[i];
                    array[i]= array[j];
                    array[j]= temp;
                }
            }
        }
    }
    static void inMang(int[] array){

    }





    }

