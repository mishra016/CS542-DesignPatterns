package myCampusTour.activities;

public class SelectOnlineOrder implements SelectCafeI {
    private double cost;
    private int duration;
    private int co2;
    private int efforts;

    /**
    * This is the public constructor for SelectOnlineOrder
    */
    public SelectOnlineOrder(){
        cost = 10;
        duration = 10;
        co2 = 4000;
        efforts = 3800;
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
