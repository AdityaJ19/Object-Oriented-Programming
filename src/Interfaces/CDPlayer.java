package Interfaces;

public class CDPlayer implements Media{
    @Override
    public void Start() {
        System.out.println("Start Music");
    }

    @Override
    public void Stop() {
        System.out.println("Stop Music");
    }
}
