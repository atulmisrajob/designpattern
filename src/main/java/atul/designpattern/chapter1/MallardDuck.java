package atul.designpattern.chapter1;

public class MallardDuck extends Duck {

    public MallardDuck() {
        flyBehavior=new FlyWithWings();
        quackBehavior=new Quack();
    }

    public void display(){
        System.out.println(" i am mallardDuck");
    }
}
