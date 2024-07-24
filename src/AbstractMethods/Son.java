package AbstractMethods;

public class Son extends Parent{

    public Son(int age) {
        super(age);
    }

    @Override
    void career() {
        System.out.println("I am going to be Journlist");
    }

    @Override
    void partner() {
        System.out.println("Her name is Pepper");
    }
}
