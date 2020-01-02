package ClassesAndObjects;

public class Main {
    public static void main(String[] args) {

        // Ball ball = new Ball("blue", "justBall", 0, 12);
        Ball ball = new Ball();


        Basketball basketball = new Basketball();

        basketball.color = "Blue";
        basketball.name = "Basketball";
        basketball.isNBA = true;

        //basketball.isNBA();
        basketball.bounce();
        basketball.getColor();

        System.out.println(basketball.isNBA());
        System.out.println(basketball.getColor());

        /*ball.setName("Hello");
        ball.setColor("yellow");
        ball.setBounceRate(123);
        ball.setCapacity(2);*/
        // ball.showColor();
        //ball.showName();

        //System.out.println(ball.getName() + "," + ball.getColor() + ", " + ball.getBounceRate() + ", " + ball.getCapacity());
        // System.out.println(ball.getBounceRate());

    }
}
