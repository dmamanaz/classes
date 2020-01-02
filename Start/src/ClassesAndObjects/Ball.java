package ClassesAndObjects;

public class Ball {
    //Properties of the ball
    public String color, name;
    public int bounceRate;


    //Behaviors
    public void bounce() {
        System.out.println("Bouncing.");
    }

    public void deflate() {
        System.out.println("Deflating..");
    }

    public void inflates() {
        System.out.println("Inflating..");
    }
}
