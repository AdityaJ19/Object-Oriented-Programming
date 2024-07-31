package ExceptionHandling;

public class Main {
    public static void main(String[] args) {
        int a = 5;
        int b = 0;

//MyException block
        try {
            String name = "Aditya";
            if (name.equals("Aditya")) {
                throw new MyException("my name is Aditya");
            }
        }
            catch(MyException e){
                System.out.println(e.getMessage());
            }

        //MySum block
        try{
            divide(a,b);
        }
        catch (Exception e){
            System.out.println(e.getMessage());
        }finally {
            //even if exception is thrown or not Finally will always run
            System.out.println("This will always execute");
        }
    }
    static int divide(int a , int b) throws ArithmeticException{

        if (b==0){
            throw new ArithmeticException();
        }
        else{
           return a/b;
        }
    }
}
