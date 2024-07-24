package AccessControl;

public class ObjectClass {

    int num;
    float gpa;
    public ObjectClass(int num, float gpa) {
        this.num = num;
        this.gpa = gpa;
    }

    @Override
    //it gives a number representation of an object
    public int hashCode() {
        return super.hashCode();
    }

    @Override
    public boolean equals(Object obj) {
        return this.num == ((ObjectClass)obj).num;
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
    public static void main(String[] args) {
        ObjectClass obj = new ObjectClass(32, 23.4f);
        ObjectClass obj2 = new ObjectClass(32, 34.5f);

        if(obj==obj2){
            System.out.println("this is true");
        }
        if(obj.equals(obj2)){
            System.out.println("this is true for one");
        }
//        System.out.println(obj.hashCode());
//        System.out.println(obj2.hashCode());
        System.out.println(obj.getClass());
    }
}
