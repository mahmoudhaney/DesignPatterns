package StructuralPatterns.AdapterPattern.EX1_Enemies;

public class EnemyTank implements Enemy{
    @Override
    public void fireCannons() {
        System.out.println("Tank Firing Cannons!");
    }

    @Override
    public void refillGas() {
        System.out.println("Tank Refilling Gas!");
    }
}
