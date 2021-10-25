package week13homework;

public class DowhileloopTable {

    public static void main(String[] args) {

        // To generate a table of 9 using a Do While Loop

        int n1 = 9;
        int n2 = 1;

        do {
            System.out.println(n1 + "*" + n2 + " = " + n1 * n2);
            n2++;
        }
        while (n2 <= 10);

    }
    }