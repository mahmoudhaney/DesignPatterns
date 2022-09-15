package StructuralPatterns.AdapterPattern.EX2_Duck;

public class WildTurkey implements Turkey{
    @Override
    public void gobble() {
        System.out.println("I'm wild turkey gobbling");
    }

    @Override
    public void fly() {
        System.out.println("I'm wild turkey flying");
    }
}
