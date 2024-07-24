package Polymorphism;

public class Circle extends Shapes{

    // when the circle method is created in the main class
    //them this function will override the parent class function
    @Override //this is called annotation
    void area(){
        System.out.println("area of circle is 3.14*r*r");
    }
}
