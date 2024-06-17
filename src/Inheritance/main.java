package Inheritance;

public class main {
    public static void main(String[] args) {
//        Box box=new Box(4.3, 3,2.5);
//        Box box1=new Box(box);
//        System.out.println(box.l+" "+ box.h+" "+ box.w);
//        BoxWeight box2=new BoxWeight();
//        BoxWeight box3=new BoxWeight(2, 4, 3, 6);
//        System.out.println(box2.weight+" "+ box2.h);

//        Box box4=new BoxWeight(2, 4, 6, 3);
        //we cannot access box4.weight even though it is initalized
        //because it is actually the type of reference variable and
        // not the type of the object that determines what members can be accessed
//        System.out.println(box4);

//        BoxWeight box5=new Box(2, 4, 6);
        //Since both parent and child classes have many variables
        //since you are given access to the variables in the reference type i.e: BoxWeight
        //you can access the weight variable but for other variable to be
        // accessed first they need to be initialized
        //here the object itself of parent class so it will cause an error
    }
}
