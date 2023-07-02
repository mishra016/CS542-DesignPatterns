package studentCoursesBackup.util;
import java.io.File;
import java.io.FileNotFoundException;
import java.rmi.server.RemoteStub;
import java.util.ArrayList;
import java.util.Scanner;

public class FileProcessor {
    /**
     * @param pathToStudentRecord
     * @return Arraylist of student information
     * @throws FileNotFoundException
     */
    public static ArrayList<StudentInfo> getCoursePref(String pathToStudentPreferences){

        File fileStudentsPref = new File(pathToStudentPreferences);
        Scanner scStd;
        try {
            scStd = new Scanner(fileStudentsPref);

            ArrayList<StudentInfo>std= new ArrayList<>();

            while (scStd.hasNextLine()) {
                String fileContentStd = scStd.nextLine();
                Scanner scRemover= new Scanner(fileContentStd);
                scRemover.useDelimiter(";");
                String newFileContentStd= scRemover.next();
                Scanner scOther= new Scanner(newFileContentStd);
                scOther.useDelimiter(" ");
                int stdId=scOther.nextInt();
                ArrayList<String> prefs= new ArrayList<>();
                for(int i=0; i<9;i++){
                    prefs.add(scOther.next());
                }

                StudentInfo stdPref= new StudentInfo(stdId, prefs);
                std.add(stdPref);
            }
           
            return std;
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }finally {
        }
        }

    /**
     * @param pathToCourseRecord
     * @return a ArrayList of CourseInfo
     * @throws FileNotFoundException
     */
    public static ArrayList<CourseInfo> getCourseInfo(String pathToCourseRecord){
        File fileCourse = new File(pathToCourseRecord);
        Scanner sc;
        try {
            sc = new Scanner(fileCourse);       
            //declare an empty array list of courses
            ArrayList<CourseInfo> courses= new ArrayList<>();

        while (sc.hasNextLine()) {
            //one complete line is stored in a string
            String fileContent = sc.nextLine();

            Scanner scF= new Scanner(fileContent);
            scF.useDelimiter(":");
//            create an object of courseInfo, use the setter to start the information
            CourseInfo courseIn= new CourseInfo(scF.next(),scF.nextInt(), scF.nextInt());
//            push the object into the arraylist.
            courses.add(courseIn);
        }
        
        return courses;
        
    } catch (FileNotFoundException e) {
        throw new RuntimeException(e);
    } finally {
        
    }
    
    }
    

    /**
     * @param pathToStudentRecord
     * @param pathToCourseRecord
     * @param pathTocourseConflict
     * @param pathToscheduleConflict
     * @throws FileNotFoundException
     */
    public static ArrayList<String> courseAssignment(String pathToStudentPreferences, String pathToCourseRecord,String pathTocourseConflict, String pathToscheduleConflict, String outPutFilePath) throws FileNotFoundException {
        ArrayList<StudentInfo> studentInfo = getCoursePref(pathToStudentPreferences);
        ArrayList<CourseInfo> courseInfo = getCourseInfo(pathToCourseRecord);
        ArrayList<ArrayList<String>> preferencesList = new ArrayList<>(); 
        ArrayList <String> outputList = new ArrayList<>();


        ArrayList<Integer> studentId = new ArrayList<>();
        for (int j = 0; j < studentInfo.size(); j++) {
            ArrayList<String> assignedCourse = new ArrayList<>(); 
            int id = studentInfo.get(j).getStdId();
            studentId.add(id);
            for (int i = 0; i < 9; i++) {
                String courseId = studentInfo.get(j).getPref().get(i);
                for (int m = 0; m < courseInfo.size(); m++) {
                    if (courseInfo.get(m).getCname().equals(courseId)) {
                        if (courseInfo.get(m).getCapacity() != 0) {
                            if (studentInfo.get(j).getNumberOfAssignedCourses() != 3) {
                                if (!(studentInfo.get(j).getSlotsTaken().contains(courseInfo.get(m).getSchedule()))) {
                                    assignedCourse.add(courseId);
                                    courseInfo.get(m).updateCapacity();
                                    studentInfo.get(j).setNumberOfAssignedCourses(studentInfo.get(j).getNumberOfAssignedCourses() + 1);
                                    studentInfo.get(j).setSlotsTaken(courseInfo.get(m).getSchedule());
                                } else {
                                    ResultsWrite.scheduleCheckFile(pathToscheduleConflict);
                                }
                            }//errors
                        } else {
                            ResultsWrite.capacityCheckFile(pathTocourseConflict);
                        }
                        break;
                    } else {
                    }
                }

            }
            preferencesList.add(assignedCourse);
        }

        for (int k = 0; k < preferencesList.size(); k++) {
            ArrayList<String> assign = preferencesList.get(k);
            int id = studentId.get(k);
            outputList.add(id+":"+assign);
        }
        ResultsWrite.assignedCoursesOutput(outPutFilePath, outputList);
        return outputList;
    }
    
}

