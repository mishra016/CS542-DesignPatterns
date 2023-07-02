package myCampusTour.builderWorkshop;

import myCampusTour.activities.AttendLectureI;
import myCampusTour.activities.LectureInClass;
import myCampusTour.activities.LectureVideoStream;
import myCampusTour.activities.SelectCafeI;
import myCampusTour.activities.SelectInQueue;
import myCampusTour.activities.SelectOnlineOrder;
import myCampusTour.activities.PickGiftI;
import myCampusTour.activities.PickEventCenter;
import myCampusTour.activities.PickUnion;
import myCampusTour.activities.VisitBuildingI;
import myCampusTour.activities.VisitByBus;
import myCampusTour.activities.VisitByFoot;
import myCampusTour.myTour.TourEnums;
import myCampusTour.util.MyLogger;


public class Tour extends TourBuilder{

    public TourEnums visitBuilding;
    public TourEnums visitBuilding2;
    public TourEnums pickGift;
    public TourEnums cafe;
    public TourEnums attendLecture;

    private double cost;
    private int duration;
    private int co2;
    private int efforts;

    Result r = new Result();
    
    /**This is a constructor of class Tour
     * @param visitBuilding sets the Enum for first building
     * @param visitBuilding2 sets Enum for second building
     * @param pickGift sets Enum for pickGift Activity
     * @param cafe sets Enum for CafeLocation activity
     * @param attendLecture sets Enum for Lecture
     */
    public Tour(TourEnums visitBuilding, TourEnums visitBuilding2, TourEnums pickGift, TourEnums cafe, TourEnums attendLecture){
        MyLogger.writeMessage("Campus Tour Construction", MyLogger.DebugLevel.CONSTRUCTOR);  
        this.visitBuilding = visitBuilding;
        this.visitBuilding2 = visitBuilding2;
        this.pickGift = pickGift;
        this.cafe = cafe;
        this.attendLecture = attendLecture;
    }

    /* 
     * This Method is called when the user selects his/her BuildingVisit choice
     */
    @Override
    public void visitBuilding() {
        VisitBuildingI visitBuildingI;
        if(visitBuilding == TourEnums.WATSON_BUS || visitBuilding == TourEnums.SOM_BUS ||visitBuilding == TourEnums.HARPUR_BUS){
            visitBuildingI = new VisitByBus();
            cost = visitBuildingI.totalCost();
            duration = visitBuildingI.durationOfActivity();
            co2 = visitBuildingI.CarbonFootprintUsed();
            efforts = visitBuildingI.totalEfforts();
            r.storeResult(cost, duration, co2, efforts);

        }else if(visitBuilding == TourEnums.WATSON_FOOT|| visitBuilding == TourEnums.SOM_FOOT|| visitBuilding == TourEnums.HARPUR_FOOT){
            visitBuildingI = new VisitByFoot();
            cost = visitBuildingI.totalCost();
            duration = visitBuildingI.durationOfActivity();
            co2 = visitBuildingI.CarbonFootprintUsed();
            efforts = visitBuildingI.totalEfforts();
            r.storeResult(cost, duration, co2, efforts);
        }
       if(visitBuilding2 == TourEnums.WATSON_BUS || visitBuilding2 == TourEnums.SOM_BUS ||visitBuilding2 == TourEnums.HARPUR_BUS){
           visitBuildingI = new VisitByBus();
           cost = visitBuildingI.totalCost();
           duration = visitBuildingI.durationOfActivity();
           co2 = visitBuildingI.CarbonFootprintUsed();
           efforts = visitBuildingI.totalEfforts();
           r.storeResult(cost, duration, co2, efforts);

       }else if(visitBuilding2 == TourEnums.WATSON_FOOT|| visitBuilding2 == TourEnums.SOM_FOOT|| visitBuilding2 == TourEnums.HARPUR_FOOT){
           visitBuildingI = new VisitByFoot();
           cost = visitBuildingI.totalCost();
           duration = visitBuildingI.durationOfActivity();
           co2 = visitBuildingI.CarbonFootprintUsed();
           efforts = visitBuildingI.totalEfforts();
           r.storeResult(cost, duration, co2, efforts);
       }

    }


    /* 
     * This Method is called when the user selects his/her choice to pick gift Loaction
     */
    @Override
    public void pickGift() {
        double trialCost =  5;
        PickGiftI pickGiftI;
        if(pickGift == TourEnums.UNIVERSITYUNION){
            pickGiftI = new PickUnion();
            pickGiftI.setCost(trialCost);
            cost = pickGiftI.totalCost();
            duration = pickGiftI.durationOfActivity();
            co2 = pickGiftI.CarbonFootprintUsed();
            efforts = pickGiftI.totalEfforts();
            r.storeResult(cost,duration, co2, efforts);

        }else if(pickGift == TourEnums.EVENTCENTER){
            trialCost = 4;
            pickGiftI = new PickEventCenter();
            pickGiftI.setCost(trialCost);
            cost = pickGiftI.totalCost();
            duration = pickGiftI.durationOfActivity();
            co2 = pickGiftI.CarbonFootprintUsed();
            efforts = pickGiftI.totalEfforts();
            r.storeResult(cost, duration, co2, efforts);

        }

    }

    /* 
     * This Method is called when the user selects his/her Cafeteria choic
     */
    @Override
    public void selectCafe() {
        double trialCost =  6;
        SelectCafeI selectCafeI;
        if(cafe == TourEnums.CIW_QUEUE){
            selectCafeI = new SelectInQueue();
            selectCafeI.setCost(trialCost);
            cost = selectCafeI.totalCost();
            duration = selectCafeI.durationOfActivity();
            co2 = selectCafeI.CarbonFootprintUsed();
            efforts = selectCafeI.totalEfforts();
            r.storeResult(cost, duration, co2, efforts);

        }else if(cafe == TourEnums.MOUNTAINVIEW_ONLINEORDER){
            trialCost = 6.3;
            selectCafeI = new SelectOnlineOrder();
            selectCafeI.setCost(trialCost);
            cost = selectCafeI.totalCost();
            duration = selectCafeI.durationOfActivity();
            co2 = selectCafeI.CarbonFootprintUsed();
            efforts = selectCafeI.totalEfforts();
            r.storeResult(cost, duration, co2, efforts);
        }

    }

    /* 
     * This Method is called when the user selects his/her choice to attend lecture
     */
    @Override
    public void attendLecture() {
        double trialCost = 5.5;
        AttendLectureI attendLectureI;
        if(attendLecture == TourEnums.CS542){
            attendLectureI = new LectureInClass();
            attendLectureI.setCost(trialCost);
            cost = attendLectureI.totalCost();
            duration = attendLectureI.durationOfActivity();
            co2 = attendLectureI.CarbonFootprintUsed();
            efforts = attendLectureI.totalEfforts();
            r.storeResult(cost, duration, co2, efforts);

        }else if(attendLecture == TourEnums.CS540_VIDEOSTREAM){
            trialCost = 5;
            attendLectureI = new LectureVideoStream();
            attendLectureI.setCost(trialCost);
            cost = attendLectureI.totalCost();
            duration = attendLectureI.durationOfActivity();
            co2 = attendLectureI.CarbonFootprintUsed();
            efforts = attendLectureI.totalEfforts();
            r.storeResult(cost, duration, co2, efforts);

        }

    }

    /* 
     * This method simply prints the campus tour schedule.
     */
    public void printResult(){
        r.printResult();
    }

}


