package StrategyDesignPattern.with_Strategy;

import StrategyDesignPattern.with_Strategy.Strategy.DriveStrategy;
import StrategyDesignPattern.with_Strategy.Strategy.SportsDriveStrategy;

public class OffRoadVehicle extends Vehicle{

    OffRoadVehicle() {
        super(new SportsDriveStrategy());
    }
}
