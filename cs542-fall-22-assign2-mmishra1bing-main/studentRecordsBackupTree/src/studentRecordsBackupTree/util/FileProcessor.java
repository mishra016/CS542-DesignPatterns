package studentRecordsBackupTree.util;
import studentRecordsBackupTree.bst.BST;

import java.io.File;
import java.io.FileWriter;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Scanner;

public class FileProcessor {
    private static String errorLog;
    private String input;

    private static String output;

    public String getInput() {
        return input;
    }

    public void setInput(String input) {
        this.input = input;
    }

    public static String getOutput() {
        return output;
    }

    public void setOutput(String output) {
        this.output = output;
    }

    public static String getErrorLog() {
        return errorLog;
    }

    public void setErrorLog(String errorLog) {
        this.errorLog = errorLog;
    }



    public FileProcessor(String pathToInput, String pathToOutput, String pathToError){
        this.input = pathToInput;
        this.output=pathToOutput;
        this.errorLog=pathToError;
    }

    public void getNodeInfo(String pathToInput, String pathToOutPut, String pathToError , BST mainTree, BST backup1, BST backup2) throws IOException {
        File inputFile = new File(pathToInput);

        Scanner sc;
        {
            try {
                sc = new Scanner(inputFile);
                while (sc.hasNextLine()) {
                    String inputContent = sc.nextLine();
                    int integerInput = Integer.parseInt(inputContent);
                    mainTree.insert(integerInput);
                    backup1.insert(integerInput);
                    backup2.insert(integerInput);
                }

            } catch (FileNotFoundException e) {
                Results r = new Results();
                r.writeToErrorLog("File not Found");
                System.err.println("Error: File not found");
                System.exit(0);
            }finally {

            }
        }

    }

}
