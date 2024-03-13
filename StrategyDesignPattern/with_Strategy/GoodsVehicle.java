package StrategyDesignPattern.with_Strategy;

import StrategyDesignPattern.with_Strategy.Strategy.DriveStrategy;
import StrategyDesignPattern.with_Strategy.Strategy.NormalDriveStrategy;

public class GoodsVehicle extends Vehicle{
    GoodsVehicle() {
        super(new NormalDriveStrategy());
    }
}
