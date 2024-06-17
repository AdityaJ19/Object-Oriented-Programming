import java.sql.SQLOutput;

public class MultiAttri {
    //Multiple Attributes
    String fname ="Aditya";
    String lname="Jangra";
    int age=22;

    public static void main(String[] args) {
        MultiAttri myNameF= new MultiAttri();
        MultiAttri myNameL= new MultiAttri();
        MultiAttri myAge = new MultiAttri();
        System.out.println("My Name is: " +myNameF.fname+" "+myNameL.lname);
        System.out.println("My Age is: " +myAge.age);
    }
}
