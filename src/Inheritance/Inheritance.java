package Inheritance;

public class Inheritance {
    public void area(){
        System.out.println("display area");
    }
    //Single Level Inheritance.Inheritance.
    class Triangle extends Inheritance{
        public void area(int l, int h){
            System.out.println(1/2*l*h);
        }
    }

    //Multi-Level Inheritance.Inheritance
    class EquilateralTriangle extends Triangle{
        public void area(int l, int h){
            System.out.println(1/2*l*h);
        }
    }
    class Circle extends Inheritance{
        public void area(int r){
            System.out.println((3.14)*r*r);
        }
    }
    public static void main(String[] args) {

    }
}
