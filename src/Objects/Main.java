package Objects;

public class Main {
    public static void main(String[] args) {
        Student kunal = new Student();
//        kunal.rollno = 12;
//        kunal.name = "Aditya";
//        kunal.marks = 78.5f;
       System.out.println(kunal.marks);
       System.out.println(kunal.name);
       System.out.println(kunal.rollno);

       Student random1 = new Student();

    }
}

class Student {

    int rollno;
    String name;
    float marks;

    Student (){
        //this is how you call a constructor from another constructor
        this (12, "Anshul", 94.2f);
    }
    //This is a constructor of class Student
    Student  (Student other) {
        this.name = other.name;
        this.rollno = other.rollno;
        this.marks = other.marks;
    }
    Student(int rollno, String name, float marks){
        this.rollno = rollno;
        this.name = name;
        this.marks = marks;
    }
}
