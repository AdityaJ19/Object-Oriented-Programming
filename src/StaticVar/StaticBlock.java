package StaticVar;

public class StaticBlock {
    static int a=6;
    static int b;
// Will only run once when the class is created i.e when the class is loaded for the first time
    static{
        System.out.println("I am in a static block");
        b=a*3;
    }

    public static void main(String[] args) {
        StaticBlock s=new StaticBlock();
        System.out.println(StaticBlock.a+" "+StaticBlock.b);

        StaticBlock.b +=3;
        System.out.println(StaticBlock.a+" "+StaticBlock.b);

        StaticBlock s2=new StaticBlock();
        System.out.println(StaticBlock.a+" "+StaticBlock.b);
    }
}
