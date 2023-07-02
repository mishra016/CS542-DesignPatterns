package myCampusTour.myTour;

public class SelectCafe implements SelectCafeI {
    int efforts = 2500;
    int duration = 30;
    int co2Consumed = 3000;

    @Override
    public void CarbonFootprintUsed(TourEnums activity) {
        if(TourEnums.CIW_QUEUE == activity || TourEnums.MOUNTAINVIEW_ONLINEORDER == activity){
            System.out.print("CarbonFootPrint: "+ co2Consumed+ "tonnes\n");
        }
        
    }

    @Override
    public void totalCost(TourEnums activity) {
        System.out.print("CostAssociated: ");
        if(TourEnums.CIW_QUEUE == activity){
            System.out.print("$3\n");
        }else if(TourEnums.EVENTCENTER == activity){
            System.out.print("$3.15\n"); //5% surcharge
        }
    }

    @Override
    public void durationOfActivity(TourEnums activity) {
        if(TourEnums.CIW_QUEUE == activity || TourEnums.MOUNTAINVIEW_ONLINEORDER == activity ){
            System.out.print("Duration: "+ duration+ "mins\n");
        }
        
    }

    @Override
    public void totalEfforts(TourEnums activity) {
        if(TourEnums.CIW_QUEUE == activity || TourEnums.MOUNTAINVIEW_ONLINEORDER == activity ){
            System.out.print("Efforts: "+ efforts+ "calories\n");
        }
        
    }
    
}
