package atul.designpattern.chapter1;

public class RedheadDuck extends Duck {

    public RedheadDuck() {
        flyBehavior= new FlyWithWings();
        quackBehavior = new Squeak();
    }

    @Override
    public void display() {
        System.out.println("Redhead Display");
    }
}
