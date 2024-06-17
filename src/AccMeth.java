public class AccMeth {
    //Access Methods With Objects
    public void fullThrottle(){
        System.out.println("This car is going full throttle");
    }
    public void speed(int maxspeed){
        System.out.println("the max speed of car is: " + maxspeed);
    }

    public static void main(String[] args) {
        AccMeth myCar = new AccMeth();
        myCar.fullThrottle();
        myCar.speed(200);
    }
}
