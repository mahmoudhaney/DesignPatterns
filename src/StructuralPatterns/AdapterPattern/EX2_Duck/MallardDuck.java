package StructuralPatterns.AdapterPattern.EX2_Duck;

public class MallardDuck implements Duck{
    @Override
    public void quck() {
        System.out.println("I'm mallard duck quacking!");
    }

    @Override
    public void fly() {
        System.out.println("I'm mallard duck flying");
    }
}
