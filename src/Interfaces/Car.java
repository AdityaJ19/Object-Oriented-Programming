package Interfaces;

public class Car implements Engine, Brakes{
    @Override
    public void Brake() {
        System.out.println("I am brake");
    }

    @Override
    public void Start() {
        System.out.println("I am Start");
    }

    @Override
    public void Stop() {
        System.out.println("I am Stop");
    }

    @Override
    public void Acc() {
        System.out.println("I am Accelerator");
    }
}
