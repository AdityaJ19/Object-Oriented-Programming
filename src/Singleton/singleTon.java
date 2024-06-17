package Singleton;

public class singleTon {
    //to create only one object we should avoid creating new constructors
    // as we know that upon creating new constructor automatically java creates new objects.
    //so to do that we use (private access modifier).
    private singleTon(){

    }
    private static singleTon instance;
    public static singleTon getInstance(){
        //Check whether one object is created or not
        if(instance==null){
            instance=new singleTon();
        }
        return instance;
    }
}
