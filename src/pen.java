public class pen {
    String color;
    String type;

    public void write(){
        System.out.println("this is something");
    }

    public void printColor() {
        System.out.println(this.color);
    }

    public static void main(String[] args) {
        pen pen1=new pen();
        pen1.color="Blue";
        pen1.type="Ballpoint";
        pen1.write();


        pen pen2=new pen();
        pen2.color="black";
        pen2.type="gel";

        pen1.printColor();
        pen2.printColor();
    }
}
