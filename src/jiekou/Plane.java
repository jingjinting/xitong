package jiekou;

public class Plane implements Fly{
    @Override
    public void fly() {
        System.out.println("燃烧油，向前推进");
    }
}
