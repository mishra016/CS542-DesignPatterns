package myCampusTour.builderWorkshop;
//import java.util.ArrayList;

import myCampusTour.myTour.AttendLecture;
import myCampusTour.myTour.PickGift;
import myCampusTour.myTour.SelectCafe;
import myCampusTour.myTour.TourEnums;
import myCampusTour.myTour.VisitBuilding1;

public class Tour extends TourBuilder{

    private TourEnums building1;
    private TourEnums building2;
    private TourEnums giftPlace;
    private TourEnums cafe;
    private TourEnums lecture;

    // private int cost;
    // private int duration;
    // private int co2;
    // private int effort;

    //ArrayList<Integer> arr = new ArrayList<>();
    

    public Tour(){

    }

    public Tour(TourEnums activity1, TourEnums activity2, TourEnums activity3, TourEnums activity4){
        //for activity 1
        //How to make the user visit two buildings in one activity
        if(activity1 == TourEnums.WATSON_BUS || activity1 == TourEnums.WATSON_FOOT || 
        activity1 == TourEnums.SOM_BUS ||activity1 == TourEnums.SOM_FOOT || 
        activity1 == TourEnums.HARPUR_BUS || activity1 == TourEnums.HARPUR_FOOT){
            setBuilding1(activity1);
        }else if(activity1 == TourEnums.EVENTCENTER || activity1 == TourEnums.UNIVERSITYUNION){
            setGiftPlace(activity1);
        }else if(activity1 == TourEnums.CIW_QUEUE || activity1 == TourEnums.MOUNTAINVIEW_ONLINEORDER){
            setCafe(activity1);
        }else if(activity1 == TourEnums.CS542 || activity1 == TourEnums.CS540_VIDEOSTREAM){
            setLecture(activity1);
        }else{
            System.out.println("Invalid Choice of Activity1");
            System.exit(0);
        }

        //for activity 2
        if(activity2 == TourEnums.WATSON_BUS || activity2 == TourEnums.WATSON_FOOT || 
        activity2 == TourEnums.SOM_BUS ||activity2 == TourEnums.SOM_FOOT || 
        activity2 == TourEnums.HARPUR_BUS || activity2 == TourEnums.HARPUR_FOOT){
            setBuilding1(activity2);
        }else if(activity2 == TourEnums.EVENTCENTER || activity2 == TourEnums.UNIVERSITYUNION){
            setGiftPlace(activity2);
        }else if(activity2 == TourEnums.CIW_QUEUE || activity2 == TourEnums.MOUNTAINVIEW_ONLINEORDER){
            setCafe(activity2);
        }else if(activity2 == TourEnums.CS542 || activity2 == TourEnums.CS540_VIDEOSTREAM){
            setLecture(activity2);
        }else{
            System.out.println("Invalid Choice of Activity2");
            System.exit(0);
        }

        //for activity 3
        if(activity3 == TourEnums.WATSON_BUS || activity3 == TourEnums.WATSON_FOOT || 
        activity3 == TourEnums.SOM_BUS ||activity3 == TourEnums.SOM_FOOT || 
        activity3 == TourEnums.HARPUR_BUS || activity3 == TourEnums.HARPUR_FOOT){
            setBuilding1(activity3);
        }else if(activity3 == TourEnums.EVENTCENTER || activity3 == TourEnums.UNIVERSITYUNION){
            setGiftPlace(activity3);
        }else if(activity3 == TourEnums.CIW_QUEUE || activity3 == TourEnums.MOUNTAINVIEW_ONLINEORDER){
            setCafe(activity3);
        }else if(activity3 == TourEnums.CS542 || activity3 == TourEnums.CS540_VIDEOSTREAM){
            setLecture(activity3);
        }else{
            System.out.println("Invalid Choice of Activity3");
            System.exit(0);
        }

        //for activity 4
        if(activity4 == TourEnums.WATSON_BUS || activity4 == TourEnums.WATSON_FOOT || 
        activity4 == TourEnums.SOM_BUS ||activity4 == TourEnums.SOM_FOOT || 
        activity4 == TourEnums.HARPUR_BUS || activity4 == TourEnums.HARPUR_FOOT){
            setBuilding1(activity4);
        }else if(activity4 == TourEnums.EVENTCENTER || activity4 == TourEnums.UNIVERSITYUNION){
            setGiftPlace(activity4);
        }else if(activity4 == TourEnums.CIW_QUEUE || activity4 == TourEnums.MOUNTAINVIEW_ONLINEORDER){
            setCafe(activity4);
        }else if(activity4 == TourEnums.CS542 || activity4 == TourEnums.CS540_VIDEOSTREAM){
            setLecture(activity4);
        }else{
            System.out.println("Invalid Argument for Activity4");
            System.exit(0);
        }

//         //for activity 5
//         if(activity5 == TourEnums.WATSON_BUS || activity5 == TourEnums.WATSON_FOOT ||
//         activity5 == TourEnums.SOM_BUS ||activity5 == TourEnums.SOM_FOOT ||
//         activity5 == TourEnums.HARPUR_BUS || activity5 == TourEnums.HARPUR_FOOT){
//             setBuilding1(activity5);
//         }else if(activity5 == TourEnums.EVENTCENTER || activity5 == TourEnums.UNIVERSITYUNION){
//             setGiftPlace(activity5);
//         }else if(activity5 == TourEnums.CIW_QUEUE || activity5 == TourEnums.MOUNTAINVIEW_ONLINEORDER){
//             setCafe(activity5);
//         }else if(activity5 == TourEnums.CS542 || activity5 == TourEnums.CS540_VIDEOSTREAM){
//             setLecture(activity5);
//         }else{
//             System.out.println("Invalid Argument for Activity5");
//             System.exit(0);
//         }
    }

    @Override
    public void visitBuilding1() {
        System.out.print("Building1: ");
        //Results.builder.append("Building1:");
        if(TourEnums.WATSON_BUS == building1){
            System.out.print("WATSON BY BUS\n");
            //Results.builder.append("WATSON BY BUS\n");
        }else if(TourEnums.WATSON_FOOT == building1){
            System.out.print("WATSON ON FOOT\n");
            //Results.builder.append("WATSON ON FOOT\n");
        }else if(TourEnums.SOM_BUS == building1){
           System.out.print("SOM BY BUS\n");
           // Results.builder.append("SOM BY BUS\n");
        }else if(TourEnums.SOM_FOOT == building1){
            System.out.print("SOM ON FOOT\n");
            //Results.builder.append("SOM ON FOOT\n");
        }else if(TourEnums.HARPUR_BUS == building1){
            System.out.print("HARPUR BY BUS\n");
           // Results.builder.append("HARPUR BY BUS\n");
        }else if(TourEnums.HARPUR_FOOT == building1){
            System.out.print("HARPUR ON FOOT\n");
            //Results.builder.append("HARPUR ON FOOT\n");
        }

        VisitBuilding1 build1 = new VisitBuilding1();
        build1.totalCost(building1);
        build1.durationOfActivity(building1);
        build1.CarbonFootprintUsed(building1);
        build1.totalEfforts(building1);

//        VisitBuilding1 build2 = new VisitBuilding1();
//        build2.totalCost(building2);
//        build2.durationOfActivity(building2);
//        build2.CarbonFootprintUsed(building2);
//        build2.totalEfforts(building2);
        // arr.add;
    
    }

//    @Override
//    public void visitBuilding2() {
//            System.out.print("Building2: ");
//            //Results.builder.append("Building1:");
//            if(TourEnums.WATSON_BUS == building2){
//                System.out.print("WATSON BY BUS\n");
//                //Results.builder.append("WATSON BY BUS\n");
//            }else if(TourEnums.WATSON_FOOT == building2){
//                System.out.print("WATSON ON FOOT\n");
//                //Results.builder.append("WATSON ON FOOT\n");
//            }else if(TourEnums.SOM_BUS == building2){
//               System.out.print("SOM BY BUS\n");
//               // Results.builder.append("SOM BY BUS\n");
//            }else if(TourEnums.SOM_FOOT == building2){
//                System.out.print("SOM ON FOOT\n");
//                //Results.builder.append("SOM ON FOOT\n");
//            }else if(TourEnums.HARPUR_BUS == building2){
//                System.out.print("HARPUR BY BUS\n");
//               // Results.builder.append("HARPUR BY BUS\n");
//            }else if(TourEnums.HARPUR_FOOT == building2){
//                System.out.print("HARPUR ON FOOT\n");
//                //Results.builder.append("HARPUR ON FOOT\n");
//            }
//
//            VisitBuilding1 build2 = new VisitBuilding1();
//            build2.totalCost(building2);
//            build2.durationOfActivity(building2);
//            build2.CarbonFootprintUsed(building2);
//            build2.totalEfforts(building2);
//        }
//
    
    @Override
    public void pickGift() {
        System.out.print("Gift Loaction: ");
            if(TourEnums.EVENTCENTER == giftPlace){
                System.out.print("EVENT CENTER\n");
            }else if(TourEnums.UNIVERSITYUNION == giftPlace){
                System.out.print("UNIVERSITY UNION\n");
            }
    
            PickGift giftP = new PickGift();
            giftP.totalCost(giftPlace);
            giftP.durationOfActivity(giftPlace);
            giftP.CarbonFootprintUsed(giftPlace);
            giftP.totalEfforts(giftPlace);
        
    }

    @Override
    public void selectCafe() {
        System.out.print("Cafe Loaction: ");
        if(TourEnums.CIW_QUEUE == cafe){
            System.out.print("COLLEGE IN WOODS(CIW)\n");
        }else if(TourEnums.MOUNTAINVIEW_ONLINEORDER == cafe){
            System.out.print("MOUNTAIN VIEW\n");
        }

        SelectCafe cafeteria = new SelectCafe();
        cafeteria.totalCost(cafe);
        cafeteria.durationOfActivity(cafe);
        cafeteria.CarbonFootprintUsed(cafe);
        cafeteria.totalEfforts(cafe);
        
    }

    @Override
    public void attendLecture() {
        System.out.print("Lecture Attended: ");
        if(TourEnums.CS542 == lecture){
            System.out.print("CS542 IN-CLASS LECTURE\n");
        }else if(TourEnums.CS540_VIDEOSTREAM == lecture){
            System.out.print("CS540 VIDEOSTREAMED LECTURE\n");
        }

        AttendLecture attendL = new AttendLecture();
        attendL.totalCost(lecture);
        attendL.durationOfActivity(lecture);
        attendL.CarbonFootprintUsed(lecture);
        attendL.totalEfforts(lecture);
        
    }

    @Override
    public void setBuilding1(TourEnums buildingVal1) {

        this.building1 = buildingVal1;
    }
//    @Override
//    public void setBuilding2(TourEnums buildingVal1) {
//
//        this.building1 = buildingVal1;
//    }


    @Override
    public void setGiftPlace(TourEnums giftPlaceVal) {
       this.giftPlace = giftPlaceVal;
        
    }

    @Override
    public void setCafe(TourEnums cafeVal) {
        this.cafe = cafeVal;
        
    }

    @Override
    public void setLecture(TourEnums lectureVal) {
        this.lecture = lectureVal;
        
    }

    
}
