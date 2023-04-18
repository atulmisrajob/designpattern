package atul.designpattern.chapter3;

public class Mocha extends CondimentDecorator{

    public Mocha(Beverage beverage) {
        this.beverage=beverage;
    }

    @Override
    public double cost() {
        return beverage.cost()+0.56;
    }

    @Override
    public String getDescription() {
        return beverage.getDescription()+" Mocha ";
    }
}
