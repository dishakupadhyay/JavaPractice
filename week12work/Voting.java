package week12work;

public class Voting {
    /* Candidate is eligible for voting or not
    input age>=18---can vote
    input age<18----can't vote
     */
    public static void main(String[] args) {
        int a1=25;
        if(a1>18)
            System.out.println("Candidate can vote");

        int a2=12;
        if(a2>18)
            System.out.println("Candidate can vote");
        else
            System.out.println("Candidate can not vote");
    }
}
