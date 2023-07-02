package myCampusTour.builderWorkshop;

import java.util.ArrayList;

 public class Result {
 	private double costTotal = 0.0;
 	private int timeTotal=0;
 	private int co2Total=0;
 	private int effortsTotal = 0;
    ArrayList<Integer> arr = new ArrayList<>();


    /**
	 * This method is used to store the result in a data structure (ArrayList in my case)
     * @param cost value for cost
     * @param time value for time
     * @param co2 value for co2
     * @param efforts value for efforts
     */
    public void storeResult(double cost, int time, int co2, int efforts){
 		arr.add((int) cost);
 		arr.add(time);
 		arr.add(co2);
 		arr.add(efforts);
 	}

 	/**
 	 * This method is used to print result on the screen
 	 */
 	public void printResult(){
 		for(int i =0; i<arr.size(); i=i+4){
			 costTotal = costTotal+arr.get(i);
		}
		System.out.println("Total Cost of Tour: $"+costTotal);

		for(int i =1; i<arr.size(); i=i+4){
			timeTotal = timeTotal+arr.get(i);
		}
		System.out.println("Total Duration of Tour: "+timeTotal+" minutes");

		for(int i =2; i<arr.size(); i=i+4){
			co2Total = co2Total+arr.get(i);
		}
		System.out.println("Total CarbonFootPrints of Tour: "+co2Total+" tonnes");

		for(int i =3; i<arr.size(); i=i+4){
			effortsTotal = effortsTotal+arr.get(i);
		}
		System.out.println("Total Efforts of Tour: "+effortsTotal+" calories");
		System.out.println();
	}
}

