package myCampusTour.myTour;

public class AttendLecture implements AttendLectureI {
    int efforts = 4000;
    int duration = 50;
    int co2Consumed = 6000;

    @Override
    public void CarbonFootprintUsed(TourEnums activity) {
        if(TourEnums.CS542 == activity || TourEnums.CS540_VIDEOSTREAM == activity){
            System.out.print("CarbonFootPrint: "+ co2Consumed+ "tonnes\n");
        }
        
    }

    @Override
    public void totalCost(TourEnums activity) {
        System.out.print("CostAssociated: ");
        if(TourEnums.CS542 == activity){
            System.out.print("$5.5\n"); //10% surcharge
        }else if(TourEnums.CS540_VIDEOSTREAM == activity){
            System.out.print("$5\n"); 
        }
        
    }

    @Override
    public void durationOfActivity(TourEnums activity) {
        if(TourEnums.CS542 == activity || TourEnums.CS540_VIDEOSTREAM == activity){
            System.out.print("Duration: "+ duration+ "mins\n");
        }
        
    }

    @Override
    public void totalEfforts(TourEnums activity) {
        if(TourEnums.CS542 == activity || TourEnums.CS540_VIDEOSTREAM == activity ){
            System.out.print("Efforts: "+ efforts+ "calories\n");
        }
        
    }
    
}
