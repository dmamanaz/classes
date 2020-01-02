package ClassesAndObjects;

public class Main {
    public static void main(String[] args) {

        Ball myBall = new Ball();
        Ball secondBall = new Ball();


        myBall.color = "Blue";
        myBall.name = "Basketball";

        System.out.println(myBall.color);
        System.out.println(myBall.name);

        System.out.println(secondBall);

    }
}
