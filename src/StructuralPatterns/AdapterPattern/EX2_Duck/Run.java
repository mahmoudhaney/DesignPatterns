package StructuralPatterns.AdapterPattern.EX2_Duck;

public class Run {
    public static void main(String[] args){
        Duck duck = new MallardDuck();
        testDuck(duck);
        System.out.println("=======================");
        Duck turkey = new TurkeyAdapter(new WildTurkey());
        testDuck(turkey);
        System.out.println("=======================");
        Duck drone = new DroneAdapter(new SuperDrone());
        testDuck(drone);

    }
    static void testDuck(Duck duck){
        duck.quck();
        duck.fly();
    }
}
