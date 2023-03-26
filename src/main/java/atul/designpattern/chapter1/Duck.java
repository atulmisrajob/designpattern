package atul.designpattern.chapter1;

public abstract class Duck {
    QuackBehavior quackBehavior;
    FlyBehavior flyBehavior;
    public abstract void display();
    public void performQuack() {
        quackBehavior.quack();
    }
    public void performFly() {
        flyBehavior.fly();
    }
    public void swim() {
        System.out.println("all ducks floats,even decoys!");
    }

    public void setQuackBehavior(QuackBehavior quackBehavior) {
        this.quackBehavior = quackBehavior;
    }

    public void setFlyBehavior(FlyBehavior flyBehavior) {
        this.flyBehavior = flyBehavior;
    }
}
