package week13homework;

public class ForloopOddeven {

    public static void main(String[] args) {
        /* To print 10 even numbers
        I am trying to print 10 even numbers from 0 to 20
         */

        {
            for (int i = 0; i < 20; i++)

                if (i % 2 == 0) {

                    System.out.println(i);
                }
        }


        /*To print 10 odd numbers
        I am trying to print 10 odd numbers ranging from 20 to 40
         */

        {
            for (int j = 20; j < 40; j++)

                if (j % 2 == 1) {

                    System.out.println(j);
                }
        }
    }
}