package Singleton;

import AccessControl.Access;

public class subclass extends Access {

    public subclass(int num, String name) {
        super(num, name);
    }

    public static void main(String[] args) {
        subclass sub = new subclass(32, "Aditya Jangra");
        //this is a subclass in different package to access protected access modifier
        int n = sub.num;
    }
}
