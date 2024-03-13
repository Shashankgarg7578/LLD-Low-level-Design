package StrategyDesignPattern.with_Strategy;

import StrategyDesignPattern.with_Strategy.Strategy.DriveStrategy;

public class Vehicle {

    DriveStrategy driveStrategy;

    //constructor Injection
    Vehicle(DriveStrategy driveStrategyObj){
        this.driveStrategy = driveStrategyObj;
    }

    public void drive(){
        driveStrategy.drive();
    }
}
