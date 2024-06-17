public class Constructors {
    String name;
    int age;
    String grade;

    public void printInfo(){
        System.out.println(this.name);
        System.out.println(this.age);
        System.out.println(this.grade);
    }
    //Parameterized Constructors
    Constructors(String name, int age, String grade){
        //objects are defined in the class function
        this.age=age;
        this.name=name;
        this.grade=grade;
    }
    public static void main(String[] args) {
        //values are defined in the object section
        Constructors student=new Constructors("Aditya", 22, "Unemployed");
        student.printInfo();
    }
}
