package weeek14homework;

public class RunTest {

    public static void main(String[] args) {

        ApplePhone i = new ApplePhone();
        i.colour = " Black";
        i.model = "IPhone 13";
        i.OS = "i.o.s";
        System.out.println(i.model);
        i.getTotalPrice();


        SamsungPhone s = new SamsungPhone();
        s.colour = "Rosegold";
        s.model = "Samsung galaxy 10";
        s.OS = "Android";
        System.out.println(s.waterproof);
        System.out.println(s.model);
        s.getTotalPrice();

        Television t = new Television();
        t.colour = "Black";
        t.model = "LG";
        System.out.println(t.model);
        t.getTotalPrice();
        t.SmartTV = "Yes";


    }
}
