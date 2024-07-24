package AccessControl;

public class Access {
    //these are data members
//    private int num;
//    public int num;
//    int num;
    protected int num;
    String name;

    //We can not access the reference of the array we can modify it add into it but we cannot access it
    //because it is a private
    int[] arr;

    public int getNum() {
        return num;
    }

    public void setNum(int num) {
        this.num = num;
    }

    public Access (int num, String name){
        this.arr = new int[num];
        this.name = name;
        this.num = num;
    }

}
