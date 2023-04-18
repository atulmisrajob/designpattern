package atul.designpattern.chapter3;

public class Whip extends CondimentDecorator{

    public Whip(Beverage beverage) {
        this.beverage=beverage;
    }

    @Override
    public double cost() {
        return beverage.cost()+0.86;
    }

    @Override
    public String getDescription() {
        return beverage.getDescription()+" Whip ";
    }
}
