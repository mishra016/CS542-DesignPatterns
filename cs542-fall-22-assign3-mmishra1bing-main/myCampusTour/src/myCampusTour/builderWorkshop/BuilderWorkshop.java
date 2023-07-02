package myCampusTour.builderWorkshop;

public class BuilderWorkshop implements BuilderWorkshopI {

    @Override
    public void construct(TourBuilder myTour) {
        myTour.visitBuilding1();
        //myTour.visitBuilding2();
        myTour.pickGift();
        myTour.selectCafe();
        myTour.attendLecture();
       // myTour.printResult();
    }
    
}
