package myCampusTour.myTour;

public class VisitBuilding1 implements VisitBuildingI {

    int efforts = 34;
    int duration = 20;
    int co2Consumed = 2200;

    @Override
    public void CarbonFootprintUsed(TourEnums activity) {
        if(TourEnums.WATSON_BUS == activity || TourEnums.WATSON_FOOT== activity){
            System.out.print("CarbonFootPrint: "+ co2Consumed+ "tonnes\n");
            //Results.builder.append("CarbonFootPrint: "+ co2Consumed+ "tonnes\n");
        }else if(TourEnums.SOM_BUS == activity || TourEnums.SOM_FOOT== activity){
            System.out.print("CarbonFootPrint: "+ co2Consumed+ "tonnes\n");
            //Results.builder.append("CarbonFootPrint: "+ co2Consumed+ "tonnes\n");
        }else if(TourEnums.HARPUR_BUS == activity || TourEnums.HARPUR_FOOT== activity){
            System.out.print("CarbonFootPrint: "+ co2Consumed+ "tonnes\n");
            //Results.builder.append("CarbonFootPrint: "+ co2Consumed+ "tonnes\n");
        }
        
    }

    @Override
    public void totalCost(TourEnums activity) {
        System.out.print("CostAssociated: ");
        //Results.builder.append("CostAssociated: ");
        if(TourEnums.WATSON_BUS == activity){
            System.out.print("$3\n");
            //Results.builder.append("\t$3\n");
        }else if(TourEnums.WATSON_FOOT== activity){
            System.out.print("$1\n");
            //Results.builder.append("\t$1\n");   
        }else if(TourEnums.SOM_BUS == activity){
            System.out.print("$3\n");
            //Results.builder.append("\t$3\n");
        }else if(TourEnums.SOM_FOOT == activity){
            System.out.print("$1\n");
            //Results.builder.append("\t$1\n");
        }else if(TourEnums.HARPUR_BUS == activity){
            System.out.print("$3\n");
            //Results.builder.append("\t$3\n");
        }else if(TourEnums.HARPUR_FOOT== activity){
            System.out.print("$1\n");
            //Results.builder.append("\t$1\n");
        }
        
    }

    @Override
    public void durationOfActivity(TourEnums activity) {
        if(TourEnums.WATSON_BUS == activity || TourEnums.WATSON_FOOT== activity){
            System.out.print("Duration: "+ duration+ "mins\n");
            //Results.builder.append("Duration: "+ duration+ "mins\n");
        }else if(TourEnums.SOM_BUS == activity || TourEnums.SOM_FOOT== activity){
            System.out.print("Duration: "+ duration+ "mins\n");
            //Results.builder.append("Duration: "+ duration+ "mins\n");
        }else if(TourEnums.HARPUR_BUS == activity || TourEnums.HARPUR_FOOT== activity){
            System.out.print("Duration: "+ duration+ "mins\n");
            //Results.builder.append("Duration: "+ duration+ "mins\n");
        }
    }

    @Override
    public void totalEfforts(TourEnums activity) {
        if(TourEnums.WATSON_BUS == activity || TourEnums.WATSON_FOOT== activity){
            System.out.print("Efforts: "+ efforts+ "calories\n");
            //Results.builder.append("Efforts: "+ efforts+ "calories\n");
        }else if(TourEnums.SOM_BUS == activity || TourEnums.SOM_FOOT== activity){
            System.out.print("Efforts: "+ efforts+ "calories\n");
            //Results.builder.append("Efforts: "+ efforts+ "calories\n");
        }else if(TourEnums.HARPUR_BUS == activity || TourEnums.HARPUR_FOOT== activity){
            System.out.print("Efforts: "+ efforts+ "calories\n");
           // Results.builder.append("Efforts: "+ efforts+ "calories\n");
        }
        
    }
    
}
