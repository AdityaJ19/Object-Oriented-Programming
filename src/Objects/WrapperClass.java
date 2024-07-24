package Objects;

public class WrapperClass {
    public static void main(String[] args) {
        int a = 10;
        //this below is a wrapper class
        //wrapper class defines the primitive data types as objects
       // Integer num = new Integer(45);
        final int num = 10;
        //it will give error cause num is final
        //num = 20;

    final A aditya = new A("Aditya Jangra");
    aditya.name = "Adi";

    A obj;
        for (int i = 0; i < 1000000000; i++) {
            obj = new A("Random name");
        }

    //when a non-primitive is final you can not change it
    //aditya = new A("new Object");
    }

}
class A {
final int numb = 20;
    String name;

    public A(String name) {
        System.out.println("Object has been created");
        this.name = name;
    }

    @Override
    protected void finalize() throws Throwable {
        System.out.println("Object has been destroyed");
    }
}
