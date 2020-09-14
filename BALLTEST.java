package BALLTEST;

public class BallTEST {
    public static void main (String [] args) {
        Ball d1 = new Ball ("Green", 540);
        Ball d2 = new Ball ("Red",257);
        Ball d3 = new Ball ("Blue");
        d3.setSize(100);
        System.out.println(d1);
        d1.Out();
        d2.Out();
        d3.Out();
    }
}
