package Inheritance;

public class BoxWeight extends Box {
    double weight;
    BoxWeight(){
        this.weight=-1;
    }
    BoxWeight(BoxWeight other){
        super(other);
        weight=other.weight;
    }

    BoxWeight(double l, double w, double h, double weight) {
        //this super keyword is used to access the object of directly above class
        //(super) keyword can be used instead of (this) keyword
        //but we only use (super) keyword for the varibales which are present in both parent class and also
        // child class so then to access the variable present in parent class we use (super) keyword.
        super(l, w, h); //Call the parent class constructor
        this.weight = weight;
    }

    BoxWeight (double side, double weight) {
        super(side);
        this.weight = weight;
    }
}
