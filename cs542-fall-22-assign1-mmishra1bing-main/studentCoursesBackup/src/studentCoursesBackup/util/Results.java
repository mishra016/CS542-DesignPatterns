package studentCoursesBackup.util;
import java.io.PrintWriter;
import java.util.ArrayList;

public class Results implements FileDisplayInterface, StdoutDisplayInterface {
	//learn what is java interface
    //out everything from resultsWrite class to results class

	/**
     * @param pathTocourseConflict
     * To write the output to the existing file.
     */

    public static void assignedCoursesOutput( String outPutFilePath, ArrayList<String> outputList) {
        try{
            PrintWriter printWriter = new PrintWriter(outPutFilePath);
            printWriter.print(outputList);
            printWriter.close ();  
        }catch(Exception e){
            System.out.println(e);
        }finally {
        }
    }
    /**
     * @param pathTocourseConflict
     * To write the output to the existing file.
     */
    public static void capacityCheckFile(String pathTocourseConflict) {
        try{
            PrintWriter printWriter = new PrintWriter(pathTocourseConflict);
            printWriter.print("Capacity is Full");
            printWriter.close ();  
        }catch(Exception e){
            System.out.println(e);
        }finally {
        }
    }

    /**
     * @param pathToscheduleConflict
     * writes the schedule conflict in the file Mentioned
     */
    public static void scheduleCheckFile(String pathToscheduleConflict) {
        try{
            PrintWriter printWriter = new PrintWriter(pathToscheduleConflict);
            printWriter.print("Conflict in the Schedule");
            printWriter.close ();  
        }catch(Exception e){
            System.out.println(e);
        }finally {
        }
    }


}
