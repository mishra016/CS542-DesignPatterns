package myCampusTour.util;

import myCampusTour.builderWorkshop.TourBuilder;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class Results implements StdoutDisplayInterface, FileDisplayInterface {



    @Override
    public void writeToDisplay(StringBuilder builder) {
        System.out.println(builder.toString());
    }


    @Override
    public void displayToFile(TourBuilder myTour) {
        try{
            FileWriter fileName = new FileWriter(FileProcessor.getOutput());
            BufferedWriter bw = new BufferedWriter(fileName);
            bw.append(myTour.toString());
            bw.close();
        } catch (IOException e) {
            //writeToErrorLog("Issue with the OutputFile");
            System.err.println("Error: Issue with the outputFile");
            System.exit(0);
        }
        finally {

        }
    }
}
