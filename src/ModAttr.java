public class ModAttr {
    int x=5; // x value stored is 5

    public static void main(String[] args) {
        ModAttr myObj = new ModAttr();
        ModAttr myObj1 = new ModAttr();
        myObj1.x=34; // now the value of has has been overridden with 34
        System.out.println(myObj.x);
        System.out.println(myObj1.x);
    }
}
