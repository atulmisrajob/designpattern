package atul.designpattern.chapter1;

public class MiniDuckSimulator {

    public static void main(String[] args){
        Duck mallardDuck= new MallardDuck();
        mallardDuck.performFly();
        mallardDuck.performQuack();


        Duck redHeadDuck = new RedheadDuck();
        redHeadDuck.performQuack();
        redHeadDuck.performFly();

        Duck rocketDuck= new ModelDuck();
        rocketDuck.performFly();
        rocketDuck.performQuack();
        rocketDuck.setFlyBehavior(new FlyRocketPowered());
        rocketDuck.performFly();
    }
}
