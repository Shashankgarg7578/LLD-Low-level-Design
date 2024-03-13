package StrategyDesignPattern.with_Strategy.Strategy;

public class NormalDriveStrategy implements DriveStrategy{
    @Override
    public void drive() {
        System.out.println("normal drive capability");
    }
}
