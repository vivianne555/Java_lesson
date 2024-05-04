package Array;


    import java.util.Scanner;
public class ArrayEx9 {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);

            System.out.print("");
            String input = scanner.nextLine();


            String[] inputArray = input.split(" ");
            int[] arr = new int[inputArray.length];
            for (int i = 0; i < inputArray.length; i++) {
                arr[i] = Integer.parseInt(inputArray[i].trim());
            }

            System.out.println("Mảng đã nhập:");
            for (int num : arr) {
                System.out.print(num + " ");
            }
            System.out.println();

            int max = arr[0];
            int maxIndex = 0;
            for (int i = 1; i < arr.length; i++) {
                if (arr[i] > max) {
                    max = arr[i];
                    maxIndex = i;
                }
            }

            System.out.println("Số lớn nhất trong mảng là: " + max);
            System.out.println("Vị trí của số lớn nhất là: " + maxIndex);
        }
    }
