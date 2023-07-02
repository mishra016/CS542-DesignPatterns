package studentCoursesBackup.util;

public class CourseInfo {
   private String cName;
    private int capacity;
    private int schedule;

    //constructor
    public CourseInfo(String cName, int capacity, int schedule) {
        this.cName=cName;
        this.capacity=capacity;
        this.schedule=schedule;
    }

    public String toString(){
        //overriding the toString() method
        return cName+" "+capacity+" "+schedule;
    }


    public String getCname() {
        return cName;
    }

    //capacity will keep on decreasing by 1.
    public void updateCapacity(){
        capacity= capacity-1;
    }

    public int getCapacity() {
        return capacity;
    }

    public int getSchedule() {
        return schedule;
    }

}
