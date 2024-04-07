//1. Write a program to input the weekday number (1-7) and print the corresponding day of weekday name
// using if else.
//    ex:
//    Input: 1
//    output:Monday
import java.util.Scanner;
public class Execrise13 {
        public static void main(String[] args) {
            int weekday = 0;
            if (weekday == 1) {
                System.out.println("Monday");
            } else if (weekday == 2) {
                System.out.println("Tuesday");
            } else if (weekday == 3) {
                System.out.println("Wednesday");
            } else if (weekday == 4) {
                System.out.println("Thursday");
            } else if (weekday == 5) {
                System.out.println("Friday");
            } else if (weekday == 6) {
                System.out.println("Saturday");
            } else if (weekday == 7) {
                System.out.println("Sunday");
            } else {
                System.out.println(" Không hợp lệ, vui lòng thử lại ");
            }
        }
    }

