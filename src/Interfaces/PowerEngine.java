package Interfaces;

public class PowerEngine implements Engine{
    @Override
    public void Start() {
        System.out.println("Power engine starts");
    }

    @Override
    public void Stop() {
        System.out.println("Power engine stops");
    }

    @Override
    public void Acc() {
        System.out.println("Power engine accelerates");
    }
}
