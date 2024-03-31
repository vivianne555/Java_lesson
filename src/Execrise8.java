import static java.lang.Math.pow;

public class Execrise8 {
    public static void main(String[] args) {
        double Principal,Rate, Time;
        Principal = 1200;
        Rate = 5.4;
        Time = 2;
//Amount = principal * [(1 + rate / 100)]^  time.
        System.out.println("Compound Interest= "+ (Principal*(Math.pow((1 + Rate/100),Time))));
    }
}
