package BehavioralPatterns.StrategyPattern;

public class RedHeadDuck extends Duck{
    public RedHeadDuck() {
        flyBehavior = new FlyWithWings();
        quackBehavior = new Quack();
    }
    @Override
    public void display() {
        System.out.println("I am a Red Head Duck");
    }
}
