package myCampusTour.activities;

public class PickUnion implements PickGiftI {

    private double cost;
    private int duration;
    private int co2;
    private int efforts;

    /**
    * This is the public constructor for PickUnion
    */
    public PickUnion(){
        cost = 7;
        duration = 20;
        co2 = 2000;
        efforts = 1800;
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

    /* 
     * This method is used to set the cost
     * 
     */

    @Override
    public void setCost(double trialCost) {
        this.cost = trialCost;

    }

}
