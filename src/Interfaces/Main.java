package Interfaces;

public class Main {
    public static void main(String[] args) {
        Car car = new Car();
        //we can add type of the variable as type of the interface
//        Engine car = new Car();
        car.Acc();
        car.Start();
        car.Stop();
        car.Brake();
        CDPlayer player = new CDPlayer();
        player.Start();
        player.Stop();
    }
}
