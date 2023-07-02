package studentRecordsBackupTree.util;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;


public class Results implements FileDisplayInterface, StdoutDisplayInterface {

    /*
     * Took the BufferWriter code Syntax from gfg
     */
    @Override
    public void displayToFile(StringBuilder mainTreeIn, StringBuilder backup1In, StringBuilder backup2In, int sumOfMainTreeIn, int sumOfBackup1In, int sumOfBackup2In, int upSumOfMainTree, int upSumOfBackup1, int upSumOfBackup2) {
        try{
            FileWriter fileName = new FileWriter(FileProcessor.getOutput());
            BufferedWriter bw = new BufferedWriter(fileName);
            bw.append("// Inorder traversal");
            bw.append("\nBST: ").append(mainTreeIn.substring(0, mainTreeIn.length()-2));
            bw.append("\nBackup-1: ").append(backup1In.substring(0, backup1In.length()-2));
            bw.append("\nBackup-2: ").append(backup2In.substring(0, backup2In.length()-2)).append("\n");
            bw.append("\n// Sum of all the B-Numbers in each tree");
            bw.append("\nBST: ").append(Integer.toString(sumOfMainTreeIn)).append("\nBackup-1: ").append(Integer.toString(sumOfBackup1In)).append("\nBackup-2: ").append(Integer.toString(sumOfBackup2In)).append("\n");
            bw.append("\n// Sum of all the B-Numbers after increment");
            bw.append("\nBST: ").append(Integer.toString(upSumOfMainTree)).append("\nBackup-1: ").append(Integer.toString(upSumOfBackup1)).append("\nBackup-2: ").append(Integer.toString(upSumOfBackup2));
            bw.close();
        } catch (IOException e) {
            writeToErrorLog("Issue with the OutputFile");
            System.err.println("Error: Issue with the outputFile");
            System.exit(0);
        }
        finally {

        }
    }

    /**
     * @param For writing error to the file
     */
    public void writeToErrorLog(String message){
        try{
            FileWriter errorLog = new FileWriter(FileProcessor.getErrorLog(), true);
            errorLog.write(message);
            errorLog.write("\n");
            errorLog.close();

        } catch (IOException e) {
            System.out.println("An error occurred while writing to the file");
            e.printStackTrace();
        }finally{

        }

    
    }

    /**
     * @param pathToOutPut It will create and open the errorLog.txt
     * Took the file creation syntax from gfg
     */
    public void createFile(String pathToOutPut) {
        File fileErr = new File(pathToOutPut);
        try {
            fileErr.createNewFile();
        } catch (IOException e) {
            System.err.println("Issue with the ErrorFile");
            e.printStackTrace();
        }
    }
}

