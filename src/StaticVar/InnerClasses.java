package StaticVar;

public class InnerClasses {
    //Class inside a class  so the outside class cannot be static

    //if i take this class test to outside and change the this.name function to Test.name function
    //and then i sout(a.name)(b.name) it will generate output as arpit arpit

    //static methods are class type methods they are resolved during compile-time
    //Objects are created during run-time
    static class Test{
        //static implies that i doesn't depend upon the object of outside class
        // and cannot has instances of each other
        String name;
        public Test(String name) {
            this.name = name;
        }

        @Override
        public String toString() {
            return name;
        }

        //but main and Test can have the instances of each other
        public static void main(String[] args) {
            Test a = new Test("Aditya");
            Test b = new Test("Arpit");
            System.out.println(a);

        //(.) binds the instance variable and instance methods to the reference variables
            //out is a printStream and printStream is calling a println method
//            System.out.println(a.name);
//            System.out.println(b.name);
        }
    }
}
