package atul.designpattern.chapter1;

public class Squeak implements QuackBehavior
{
    @Override
    public void quack() {
        System.out.println("i can squeak");
    }
}
