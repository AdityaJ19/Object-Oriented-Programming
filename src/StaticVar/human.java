package StaticVar;

public class human {
    String name;
    int age;
    boolean married;
    int salary;
    //Static variables are not dependant on objects you can access it before any of the
    // class of the object is created and without referencing to that object
    static long population;

    public human(String name, int age, boolean married, int salary) {
        this.name = name;
        this.age = age;
        this.married = married;
        this.salary = salary;
        human.population +=1;
    }

    public static void main(String[] args) {

    }
}
