package myCampusTour.activities;

public class VisitByBus implements VisitBuildingI {

    private double cost;
    private int duration;
    private int co2;
    private int efforts;

    /**
    * This is the public constructor for Visit By Bus
    */

    public VisitByBus(){
        cost = 3;
        duration = 20;
        co2 = 3000;
        efforts = 4200;
    }

    /* 
     * This method is used to calculate Co2 value and 
     * returns int value of co2
     */
    @Override
    public int CarbonFootprintUsed() {
        return co2;
    }

    /* 
     * This method is used to calculate cost and 
     * returns double value of cost
     */

    @Override
    public double totalCost() {
        return cost;
    }

    /* 
     * This method is used to calculate time value and 
     * returns int value of time
     */

    @Override
    public int durationOfActivity() {
        return duration;
    }

    /* 
     * This method is used to calculate efforts value and 
     * returns int value of efforts
     */

    @Override
    public int totalEfforts() {
        return efforts;
    }

}
