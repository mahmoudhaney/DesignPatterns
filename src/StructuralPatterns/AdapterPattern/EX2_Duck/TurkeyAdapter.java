package StructuralPatterns.AdapterPattern.EX2_Duck;

public class TurkeyAdapter implements Duck{
    Turkey turkey;

    public TurkeyAdapter(Turkey turkey){
        this.turkey = turkey;
    }
    @Override
    public void quck() {
        this.turkey.gobble();
    }

    @Override
    public void fly() {
        System.out.println("{ ");
        for (int i = 0; i < 3; ++i)
            this.turkey.fly();
        System.out.println("}");
    }
}
