package BehavioralPatterns.StrategyPattern;

public class Quack implements QuackBehavior{
    @Override
    public void quack() {
        System.out.println("I am Quacking!!");
    }
}
