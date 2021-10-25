package week13homework;

public class DowhileloopOddeven {

    public static void main(String[] args) {
        // To print first 10 even numbers using Do While Loop

        int a = 0;
        do {
            {
                if (a % 2 == 0)
                    System.out.println(a);
                a++;
            }

        } while (a < 20);


        // To print 10 odd numbers ranging from 20 to 40 using Do While Loop

        int b = 20;
        do {
            {
                if (b % 2 == 1)
                    System.out.println(b);
                b++;
            }

        } while (b < 40);

    }

}

