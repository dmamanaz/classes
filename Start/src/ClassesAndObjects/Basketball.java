package ClassesAndObjects;


public class Basketball extends Ball{

    //Properties
    public boolean isNBA;
    public int capacity;


    //Behaviors
    public boolean isNBA(){
            if(isNBA == true){
                return true;
            }else {
                return false;
            }
    }

    public void bounce(){
        System.out.println("Basketball is bouncing.");
    }


}
