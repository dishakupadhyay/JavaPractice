package weeek14homework;

public class MethodOverloading {

    /* In method overloading, multiple methods can have the same name with different parameters.
       Here I am using summethod name with integer and float two different parameters inside it.
     */

    public static int  summethod(int a, int b, int c) {
        return a + b +c;
    }
    public static float summethod(float d, float e){
        return d + e;
    }



    public static void main(String[] args) {
        int N1 = summethod(7,8,9);  // Passing the Arguments
        float N2 = summethod(5.35f, 3.23f);
        System.out.println("int: " + N1);
        System.out.println("double: " + N2);
    }
}
