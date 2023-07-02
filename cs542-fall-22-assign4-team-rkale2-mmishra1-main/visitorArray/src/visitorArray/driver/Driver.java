package visitorArray.driver;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;

import java.util.Map;
import java.util.Objects;
import java.util.PriorityQueue;
import java.util.Queue;

import visitorArray.myArray.MyArray;
import visitorArray.util.FileProcessor;






public class Driver {
 
  public static void main (String[] args){
       /*
     * As the build.xml specifies the arguments as argX, in case the
     * argument value is not given java takes the default value specified in
     * build.xml. To avoid that, below condition is used
     */

     //

      if (args.length != 6 || args[0].equals("${arg0}") || args[1].equals("${arg1}") || args[2].equals("${arg2}") 
      || args[3].equals("${arg3}") || args[4].equals("${arg4}") || args[5].equals("${arg5}")) {

    System.err.println("Error: Incorrect number of arguments. Program accepts 6s argumnets.");
    System.exit(0);
  }
  if (Integer.parseInt(args[5]) < 0 || Integer.parseInt(args[5]) > 3) {
    throw new IllegalArgumentException("Debug value should be between 1 and 2.");
  }
  if (args[0].equals(args[1])) {
    throw new IllegalArgumentException("Both input files have the same path and name");
  }else{

      String inputFile = args[0];
      String bToAFile=args[1];
      String topKOutputFile= args[2];
      String spellCheckOutputFile = args[3];
      int Ktop = Integer.valueOf(args[4]);
      int debugValue = Integer.valueOf(args[5]);

      try{
     FileProcessor fp = new FileProcessor(inputFile, bToAFile, topKOutputFile , spellCheckOutputFile,Ktop, debugValue);
      fp.processVisitors();
      }catch (Exception e) {
        // TODO Auto-generated catch block
        System.out.println("File Not Available");
        System.exit(0);
    }
    finally{

    }
       
  }

  }
}