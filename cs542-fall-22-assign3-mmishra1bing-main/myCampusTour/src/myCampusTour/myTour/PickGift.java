package myCampusTour.myTour;

public class PickGift implements PickGiftI {
    
    int efforts = 100;
    int duration = 10;
    int co2Consumed = 1000;

    @Override
    public void CarbonFootprintUsed(TourEnums activity) {
        if(TourEnums.UNIVERSITYUNION == activity || TourEnums.EVENTCENTER == activity ){
            System.out.print("CarbonFootPrint: "+ co2Consumed+ "tonnes\n");
        }
        
    }

    @Override
    public void totalCost(TourEnums activity) {
        System.out.print("CostAssociated: ");
        if(TourEnums.UNIVERSITYUNION == activity){
            System.out.print("$2\n");
        }else if(TourEnums.EVENTCENTER == activity){
            System.out.print("$4\n");
        }
    }

    @Override
    public void durationOfActivity(TourEnums activity) {
        if(TourEnums.UNIVERSITYUNION == activity || TourEnums.EVENTCENTER == activity ){
            System.out.print("Duration: "+ duration+ "mins\n");
        }
    }

    @Override
    public void totalEfforts(TourEnums activity) {
        if(TourEnums.UNIVERSITYUNION == activity || TourEnums.EVENTCENTER == activity ){
            System.out.print("Efforts: "+ efforts+ "calories\n");
        }
        
    }
    
}
