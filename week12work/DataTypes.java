package week12work;

public class DataTypes {
    public static void main(String[] args){
        //To use Integer Data Types with Arithmetic Operators

        byte b=5;
        short s=20;
        long l=9999999999L;
        int i=-234;

        System.out.println(b+i);
        System.out.println(l-s);
        System.out.println(s/b);
        System.out.println(b*i);
        System.out.println(b%s);

        //To use Float Data types with Arithmetic Operators
        float f= 31.12f;
        float f1 = (float) 11.12;

        System.out.println(f);
        System.out.println(f+f1);
        System.out.println(f-f1);

        double d = 3000.235;
        double d1 = 100.150;

        System.out.println(d+d1);
        System.out.println(d*d1);



        //To use Character Data Type with Arithmetic Operators
        char c1='A'; //65
        char c2= 5;
        char c3='D';  //68

        System.out.println(c1+c2);
        System.out.println(c3-c1);
        System.out.println(c1+c2+c3); //65+5+68
        System.out.println(c2/c1);
        System.out.println(++c1);

        // To use Boolean Operator
        boolean javaiseasy=true;
        boolean javaishard=false;

        if(javaiseasy) {
            System.out.println("I can do it");
        }
        if(javaishard){
            System.out.println("I will work harder");
        }
        /* Equal to    ==
        Greater than   >
        Less than      <
        Not equal to   !
         */
        boolean b2 = (3==3);
        boolean b3 = (1>5);
        boolean b4 = (25<68);
        boolean b5 = (3!=1);

        System.out.println(b2);
        System.out.println(b3);
        System.out.println(b4);
        System.out.println(b5);


    }
}
