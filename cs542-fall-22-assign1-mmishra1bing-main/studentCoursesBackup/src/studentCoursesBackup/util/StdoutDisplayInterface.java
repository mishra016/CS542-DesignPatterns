package studentCoursesBackup.util;

import java.util.ArrayList;

public interface  StdoutDisplayInterface {
    void assignedCoursesOutput( String outPutFilePath, ArrayList<String> outputList);

    void capacityCheckFile(String pathTocourseConflict);

    void scheduleCheckFile(String pathToscheduleConflict);
	
}
