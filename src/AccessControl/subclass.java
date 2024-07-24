package AccessControl;

public class subclass extends Access{

    public subclass(int num, String name) {
        super(num, name);
    }

    public static void main(String[] args) {
        subclass sub = new subclass(32, "Aditya Jangra");

        int n = sub.num;
    }
}
