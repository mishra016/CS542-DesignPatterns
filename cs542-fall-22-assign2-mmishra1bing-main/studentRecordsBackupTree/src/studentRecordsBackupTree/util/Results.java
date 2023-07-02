package studentRecordsBackupTree.util;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;


public class Results implements FileDisplayInterface, StdoutDisplayInterface {
    @Override
    public void displayToFile(StringBuilder mainTreeIn, StringBuilder backup1In, StringBuilder backup2In, int sumOfMainTreeIn, int sumOfBackup1In, int sumOfBackup2In) {
        try{
            FileWriter fileName = new FileWriter(FileProcessor.getOutput());
            BufferedWriter bw = new BufferedWriter(fileName);
            bw.append("// Inorder Traversal");
            bw.append("\nBST: ").append(mainTreeIn.substring(0, mainTreeIn.length()-2));
            bw.append("\nBackup-1: ").append(backup1In.substring(0, backup1In.length()-2));
            bw.append("\nBackup-2: ").append(backup2In.substring(0, backup2In.length()-2));
            bw.append("\n//Sum of all b-Numbers in each tree");
            bw.append("\nBST: ").append(Integer.toString(sumOfMainTreeIn)).append("\nBackup-1: ").append(Integer.toString(sumOfBackup1In)).append("\nBackup-2: ").append(Integer.toString(sumOfBackup2In));
            bw.close();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        finally {

        }
    }

    /*public void displayToFile(Node root) {
        try{
            FileWriter fileName = new FileWriter(FileProcessor.getOutput());
            BufferedWriter bw = new BufferedWriter(fileName);
            bw.write(root.toString());
            bw.close();
        }
        catch(Exception ex) {
            System.out.print("An error occurred try again ");
        }finally {
        }
    }
    public void write(Node focusNode, BufferedWriter bw) throws IOException {
        if (focusNode == null) {
            return;
        }
        write(focusNode.getLeft(), bw); // calls recursively
        bw.write(focusNode+"\n");
        write(focusNode.getRight(), bw); // calls recursively
    }*/

    public void writeToErrorLog(String message){
        try{
            FileWriter errorLog = new FileWriter(FileProcessor.getErrorLog(),true);
            errorLog.write(message);
            errorLog.write("\n");
            errorLog.close();

        } catch (IOException e) {
            System.out.println("An error occurred while writing to the file");
            e.printStackTrace();
        }finally{

        }
    }
}

