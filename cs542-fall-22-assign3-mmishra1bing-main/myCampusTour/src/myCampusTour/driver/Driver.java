package myCampusTour.driver;


import myCampusTour.builderWorkshop.BuilderWorkshop;
import myCampusTour.builderWorkshop.BuilderWorkshopI;
import myCampusTour.builderWorkshop.Tour;
import myCampusTour.builderWorkshop.TourBuilder;
import myCampusTour.myTour.TourEnums;

/**
 * @author placeholder
 *
 */
public class Driver {

	public static StringBuilder builder = new StringBuilder();
	public static void main(String[] args) {

		/*
		 * As the build.xml specifies the arguments as argX, in case the
		 * argument value is not given java takes the default value specified in
		 * build.xml. To avoid that, below condition is used
		 */

	    if (args.length != 2 || args[0].equals("${arg0}") || args[1].equals("${arg1}")) {

			System.err.println("Error: Incorrect number of arguments. Program accepts 2 argumnets.");
			System.exit(0);
		}else{

		System.out.println("-------------First CampusTour---------------");
		TourBuilder myTour = new Tour(TourEnums.SOM_FOOT,TourEnums.WATSON_BUS,TourEnums.UNIVERSITYUNION,TourEnums.CIW_QUEUE, TourEnums.CS540_VIDEOSTREAM);
		BuilderWorkshopI orientation = new BuilderWorkshop();
		orientation.construct(myTour);

		System.out.println("-------------Second CampusTour---------------");
		TourBuilder myTour2 = new Tour(TourEnums.WATSON_FOOT, TourEnums.SOM_BUS ,TourEnums.EVENTCENTER, TourEnums.MOUNTAINVIEW_ONLINEORDER, TourEnums.CS542);
		BuilderWorkshopI orientation2 = new BuilderWorkshop();
		orientation2.construct(myTour2);

		}

	}
}
