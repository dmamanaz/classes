package ClassesAndObjects;

public class Baseball extends Ball{

    //properties

    public String shape;
    public int size;

    public String shape(){
        return shape;
    }

    public int size(){
        return size;
    }

    public void bounce(){
            System.out.println("Baseball is bouncing.");
    }


}


