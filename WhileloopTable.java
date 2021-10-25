package week13homework;

public class WhileloopTable {

    public static void main(String[] args) {
        //To generate a table of 7 using While Loop

        int num1 = 7;
        int num2 = 1;
        while (num2 <= 10) {

            System.out.println(num1 + "*" + num2 + " = " + num1 * num2);
            num2++;
        }
    }
}
