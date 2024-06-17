public class copyConstructor {
    String name;
    int age;

    public void printInfo(){
        System.out.println(this.name);
        System.out.println(this.age);
    }

    copyConstructor(copyConstructor s2){
        this.name=s2.name;
        this.age=s2.age;
    }
    copyConstructor(){

    }
    public static void main(String[] args) {
        copyConstructor s1=new copyConstructor();
        s1.name="Aditya";
        s1.age=22;

        copyConstructor s2=new copyConstructor(s1);
        s2.printInfo();
    }
}
