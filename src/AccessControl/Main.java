package AccessControl;

public class Main {
    public static void main(String[] args) {
        Access access = new Access(5, "Aditya");
        //Need to do few things
        //1, Access the data members
        //2, Modify the data members

        access.getNum();
        //get num method is public even though the int num variable
        // is private so that's why we can access it from anywhere

        int num = access.num;
        //default access modifier
    }
}
