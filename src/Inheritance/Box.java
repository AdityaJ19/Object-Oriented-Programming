package Inheritance;

public class Box {
    double l;
    double w;
    double h;
    Box(){
    //This constructor takes no argument
        this.h=-1;
        this.l=-1;
        this.w=-1;
    }
    Box(double Side){
    //This constructor takes 1 argument
        this.l=Side;
        this.w=Side;
        this.h=Side;
    }
    Box(double l, double w, double h){
    //This constructor takes 3 argument
        this.l=l;
        this.w=w;
        this.h=h;
    }
    Box(Box old){
        //Takes another type of box as argument
        this.h=old.h;
        this.l=old.l;
        this.w=old.w;
    }
    public void information(){
        System.out.println("this is printing something");
    }

}
