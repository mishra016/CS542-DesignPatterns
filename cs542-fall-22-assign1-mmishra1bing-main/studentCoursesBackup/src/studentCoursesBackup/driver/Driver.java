package studentCoursesBackup.driver;
import java.io.FileNotFoundException;
import studentCoursesBackup.util.FileProcessor;

/**
 * @author placeholder
 *
 */
public class Driver {

	public static void main(String[] args) {

	
		/*
		 * As the build.xml specifies the arguments as argX, in case the
		 * argument value is not given java takes the default value specified in
		 * build.xml. To avoid that, below condition is used
		 */

	    if (args.length != 5 || args[0].equals("${arg0}") || args[1].equals("${arg1}") || args[2].equals("${arg2}")
				|| args[3].equals("${arg3}") || args[4].equals("${arg4}")) {

			System.err.println("Error: Incorrect number of arguments. Program accepts 5 argumnets.");
			System.exit(0);
		}
		else{
			 String pathToCourseRecord=args[1];
			 String pathToStudentPreferences= args[0];
			 String outPutFilePath=args[2];
			 String pathTocourseConflict=args[3];
			 String pathToscheduleConflict=args[4];
        try {
			FileProcessor.courseAssignment(pathToCourseRecord,pathToStudentPreferences, pathTocourseConflict, pathToscheduleConflict,outPutFilePath);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}finally{
		}
	}
		// System.out.println("Hello World! Lets get started with the assignment");

	}
}
