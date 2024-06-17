package Singleton;

public class main {
    public static void main(String[] args) {
        singleTon s=singleTon.getInstance();
        singleTon s1=singleTon.getInstance();
        singleTon s2=singleTon.getInstance();
    }
    //see here we see that object can not be made cause the
    // class singleTon is private and can only be accessed through singleTon main file

}
