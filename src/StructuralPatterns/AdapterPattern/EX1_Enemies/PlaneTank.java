package StructuralPatterns.AdapterPattern.EX1_Enemies;

public class PlaneTank implements Enemy{
    @Override
    public void fireCannons() {
        System.out.println("Plane Firing Cannons!");
    }

    @Override
    public void refillGas() {
        System.out.println("Plane Refilling Gas!");
    }
}
