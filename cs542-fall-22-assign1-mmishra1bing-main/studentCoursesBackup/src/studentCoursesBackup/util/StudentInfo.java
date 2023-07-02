package studentCoursesBackup.util;
import java.util.ArrayList;

public class StudentInfo {
    private int stdId;
    private ArrayList<String> pref;

    private int numberOfAssignedCourses;

    private ArrayList<Integer> slotsTaken;
    private float satisfactionScore;

    public StudentInfo(int stdId, ArrayList<String> pref){
        this.stdId= stdId;
        this.pref= pref;
        this.numberOfAssignedCourses =0;
        slotsTaken = new ArrayList<>();
        this.satisfactionScore =0;
    }

    public String toString(){
        //overriding the toString() method
        return stdId+" "+pref;
    }

    public int getStdId(){
        return stdId;
    }

    public ArrayList<String> getPref(){
        return pref;
    }

    public ArrayList<Integer> getSlotsTaken(){
        return slotsTaken;
    }

    public void setSlotsTaken(int schedule){
        this.slotsTaken.add(schedule);
    }

    public int getNumberOfAssignedCourses(){
        return numberOfAssignedCourses;
    }

    public void setNumberOfAssignedCourses(int numberOfAssignedCourses){
        this.numberOfAssignedCourses = numberOfAssignedCourses;
    }

    //add (9-courseindex) to the satisfaction score.
    public void updateSatisfactionScore(){
        satisfactionScore = satisfactionScore/3;
    }

    public float getSatisfactionScore(){
        return satisfactionScore;
    }






}

