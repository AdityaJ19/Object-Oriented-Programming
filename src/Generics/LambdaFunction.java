package Generics;

import java.util.ArrayList;
import java.util.function.Consumer;

public class LambdaFunction {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        for (int i = 0; i < 5; i++) {
            list.add(i + 1);
        }
        // lambda function is an inline function i.e one-liner functions
        // item represents every single element in the array
//        list.forEach((item)-> System.out.println(2*item));

        Consumer<Integer> fun = (item)-> System.out.println(2*item);
            list.forEach(fun);

        Operation sum = (a,b) -> a+b;
        Operation sub = (a,b) -> a-b;
        Operation mul = (a,b) -> a*b;
        Operation div = (a,b) -> a/b;

        LambdaFunction myCal = new LambdaFunction();
        System.out.println(myCal.operate(5,3,sum));
        System.out.println(myCal.operate(5,3,sub));
        System.out.println(myCal.operate(5,3,mul));
        System.out.println(myCal.operate(5,3,div));

    }
    private int operate(int a, int b, Operation op){
        return (op.operate(a,b));
    }
}
//for multiple values we use interfaces
interface Operation{
    int operate(int a, int b);
}
