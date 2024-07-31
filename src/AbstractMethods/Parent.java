package AbstractMethods;

public abstract class Parent {

    int age;
//you can create constructor and also you can create constructor in abstract class
    public Parent(int age) {
        this.age = age;
    }

    static void greeting(){
        System.out.println("hello");
    }
    //you cannot create Abstract Extras.Constructors
    //abstract Parent ();

    abstract void career();
    abstract void partner();
    //you cannot call or create an object of abstract class
    //Parent mom = new Parent();
    Parent mom = new Parent(56) {
        @Override
        void career() {

        }

        @Override
        void partner() {

        }
    };
}
