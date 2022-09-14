package BehavioralPatterns.StrategyPattern;

public abstract class Duck {
    // ========= Data Members
    private int id;
    private String name;
    static int counter = 0;
    FlyBehavior flyBehavior;
    QuackBehavior quackBehavior;

    // ========= Constructor
    Duck(){
        this.id = counter;
        this.name =  "Duck #" + this.id;
    }

    // ========= Setters
    public void setFlyBehavior(FlyBehavior flyBehavior) {
        this.flyBehavior = flyBehavior;
    }

    public void setQuackBehavior(QuackBehavior quackBehavior) {
        this.quackBehavior = quackBehavior;
    }

    // ========= Methods
    public void swim(){
        System.out.println("All ducks floats, even decoys!");
    }
    public abstract void display();

    public void performFly(){
        flyBehavior.fly();
    }
    public void performQuack(){
        quackBehavior.quack();
    }


}
