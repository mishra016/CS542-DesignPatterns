package myCampusTour.builderWorkshop;


public class BuilderWorkshop implements BuilderWorkshopI {

    /* 
     * This method takes in the Builderworkshop Interface object and calls series of methods
     */
    @Override
    public void construct(TourBuilder myTour) {
        myTour.visitBuilding();
        myTour.pickGift();
        myTour.selectCafe();
        myTour.attendLecture();
        myTour.printResult();
    }

}
