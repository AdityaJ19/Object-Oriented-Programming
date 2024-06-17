public class polymorphism {
    String name;
    int age;
    public void printInfo(String name){
        System.out.println(name);
    }
    public void printInfo(int age){
        System.out.println(age);
    }
    public void printInfo(String name, int age){
        System.out.println(name+" "+age);
    }

    public static void main(String[] args) {
        polymorphism Student=new polymorphism();
        Student.name="Aditya";
        Student.age=22;

        Student.printInfo(Student.name, Student.age);
    }
}
