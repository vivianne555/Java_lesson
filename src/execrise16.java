//Write a program to find the greatest of three numbers.
//        ex:
//        input: 12, 25, 52
//        Output:
//        The greatest number is 52
//        input: 15,30,2
//        Output:
//        The greatest number is 30.
public class execrise16 {
    public static void main(String[] args) {
        int num1 = 12;
        int num2 = 5;
        int num3 = 2;
        int greatest = num1; // Assume num1 is the greatest initially
        if (num2 > greatest) {
            greatest = num2;
        }
        if (num3 > greatest) {
            greatest = num3;
        }
        System.out.println("The greatest of the three numbers is: " + greatest);
    }
}
