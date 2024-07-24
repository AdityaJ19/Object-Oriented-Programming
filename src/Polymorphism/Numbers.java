package Polymorphism;

public class Numbers {
    int sum (int a, int b){
        return a+b;
    }
    int sum (int a, int b, int c){
        return a+b+c;
    }

    public static void main(String[] args) {
        Numbers obj = new Numbers();
        obj.sum(3,22);
        obj.sum(3,5,7);

        //obj.sum(2,4,6,7);
    }
}
