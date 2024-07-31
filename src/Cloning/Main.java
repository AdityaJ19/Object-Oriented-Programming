package Cloning;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) throws CloneNotSupportedException {
        Human Aditya = new Human(22, "Aditya");
//        Human Twin = new Human(Aditya);

        Human twin = (Human)Aditya.clone();
        System.out.println(twin.age+ " " + twin.name);
        System.out.println(Arrays.toString(twin.arr));

        twin.arr[0] = 100;
        System.out.println(Arrays.toString(twin.arr));
        System.out.println(Arrays.toString(Aditya.arr));
    }
}
