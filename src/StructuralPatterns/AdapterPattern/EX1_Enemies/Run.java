package StructuralPatterns.AdapterPattern.EX1_Enemies;

import java.util.ArrayList;

public class Run {
    public static void main(String[] args) {
        ArrayList<Enemy> enemies = new ArrayList<>();
        enemies.add(new EnemyTank());
        enemies.add(new PlaneTank());
        enemies.add(new SardeenaAdapter(new Sardeena()));

        for (Enemy enemy : enemies) {
            enemy.fireCannons();
            enemy.refillGas();
            System.out.println("==========================");
        }
    }
}
