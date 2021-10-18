package week12work;

public class EvenOdd {

    //To check if the number is odd or even

    public static void main(String[] args) {
        // 4/2--->Remainder is 0
        // 7/2--->Remainder is 1

        int x = 27;
        int remainder = x % 2;

        if (remainder == 1) {
            System.out.println("Number is odd");
        } else {
            System.out.println("Number is even");
        }
    }
}