package ClassesAndObjects;

public class Main {
    public static void main(String[] args) {


        StringBuilder stringBuilder = new StringBuilder();

        stringBuilder.append("Life");
        stringBuilder.append(" is great");
        stringBuilder.append(" when you are happy!");


        stringBuilder.delete(1, 2);

        System.out.println(stringBuilder);
        System.out.println(stringBuilder.capacity());


        // Ball ball = new Ball("blue", "justBall", 0, 12);
//        Ball ball = new Ball();
//
//        Baseball baseball = new Baseball();
//        baseball.color = "yellow";
//        baseball.capacity = 23;
//        baseball.name = "Baseball";
//        baseball.shape = "round";
//        baseball.size = 2;
//
//
//        baseball.bounce();
//
//
//
//        System.out.println(baseball.getCapacity());
//        System.out.println(baseball.getColor());
//        System.out.println(baseball.getName());
//        System.out.println(baseball.shape);
//        System.out.println(baseball.size);



        /* Basketball basketball = new Basketball();

        basketball.color = "Blue";
        basketball.name = "Basketball";
        basketball.isNBA = true;
        basketball.capacity = 23;

        //basketball.isNBA();

        System.out.println(basketball.isNBA());
        System.out.println(basketball.getColor());
        System.out.println(basketball.getCapacity());
        basketball.bounce();*/




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
