package visitorArray.util;


import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

public class Results implements FileDisplayInterface, StdoutDisplayInterface {
    
    private String topKOutputFile;
    private String swapWordOutput;
    private ArrayList<String>sensitive;
    private ArrayList<String>inSensitive;
    public BufferedWriter write;
    private FileWriter fwswap;
    private BufferedWriter buffeSwap;

    public BufferedWriter gWriter(){
        return buffeSwap;
    }
    public void setBuffeSwap(BufferedWriter bufferedWriter){
        buffeSwap = bufferedWriter;
    }
    String sb = new String();
    public void writeTopKFile(String topKOutputFileIn, String sb){
        this.topKOutputFile = topKOutputFileIn;
        try {
            FileWriter fw = new FileWriter(topKOutputFile);
            BufferedWriter buffer = new BufferedWriter(fw);
            buffer.write(sb);
            buffer.newLine();
            buffer.close();
        } catch (IOException e) {

            e.printStackTrace();
        }finally{

        }
    }

    

    // public void writeWordSwapping(String swapWordOutputIn){
    //     this.swapWordOutput = swapWordOutputIn;
    //     // this.sensitive = arr;
    //     // this.inSensitive = arr2;
    //     try {
    //         fwswap = new FileWriter(swapWordOutput);
    //         BufferedWriter bufferedW = new BufferedWriter(fwswap);
    //         setBuffeSwap(bufferedW);
    //         // buffeSwap.write("Stratergy - 1", 0, 0);
    //         // for (int i = 0; i < arr.size(); i++) {
    //         //     buffeSwap.write(arr.get(i));
    //         // }
    //         // buffeSwap.newLine();
    //         // buffeSwap.close();
    //     } catch (IOException e) {

    //         e.printStackTrace();
    //     }finally{

    //     }
    // }
    
    

}
