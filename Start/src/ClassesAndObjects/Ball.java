package ClassesAndObjects;

public class Ball {

    //Properties of the ball
    private String color, name;
    private int bounceRate, capacity;


    public Ball(){

    }

    public Ball(String color, String name, int bounceRate, int capacity) {
        this.color = color;
        this.name = name;
        this.bounceRate = bounceRate;
        this.capacity = capacity;
    }


    //Behaviors
    public void showColor(){
        System.out.println(color);
    }

    public void showName(){
        System.out.println(name);
    }


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
