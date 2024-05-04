package loop;

//Display the First 10 Natural Numbers: Write a program in java that displays the first 10 natural numbers. The expected output should be:
//
//        1 2 3 4 5 6 7 8 9 10
//
//        Write a program in C to display the n terms of a harmonic series and their sum.
//        1 + 1/2 + 1/3 + 1/4 + 1/5 ... 1/n terms
//
//        Test Data:
//
//        Input the number of terms: 5.
//
//        *Expected Output*:
//
//        1/1 + 1/2 + 1/3 + 1/4 + 1/5 +
//
//        Sum of Series up to 5 terms: 2.283334
public class LoopEx2 {
    public static void main(String[] args) {
        int i;
        System.out.print( "1 +");
        for (i = 2; i <= 9; i++){
            System.out.print( " 1/"+ i + " +");
            }
            if (i != 1) {
                System.out.print(" ");
            }
        System.out.print("1/10 = ");
        }
    }
