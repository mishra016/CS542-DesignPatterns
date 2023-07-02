package myCampusTour.builderWorkshop;

import myCampusTour.myTour.TourEnums;

public abstract class TourBuilder  {
    public abstract void setBuilding1(TourEnums buildingVal);
    //public abstract void setBuilding2(TourEnums buildingVal);
    public abstract void setGiftPlace(TourEnums giftPlaceVal);
    public abstract void setCafe(TourEnums cafeVal);
    public abstract void setLecture(TourEnums lectureVal);
    public abstract void visitBuilding1();
    //public abstract void visitBuilding2();
    public abstract void pickGift();
    public abstract void selectCafe();
    public abstract void attendLecture();
}
