package visitorArray.strategy;

import java.io.BufferedWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;

import visitorArray.myArray.MyArray;
import visitorArray.util.Results;

public class CaseInsensitiveStrategy implements StrategyI {

    private String spellCheckInput;
    private String output2File;
    private BufferedWriter bufferWrite;

    Results results = new Results();
    public CaseInsensitiveStrategy(String outuputFileIn, String spellCheckInput2, BufferedWriter BwIn){
        this.spellCheckInput = spellCheckInput2;
        this.output2File = outuputFileIn;
        this.bufferWrite = BwIn;   
    }

    @Override
    public void setStrategy(MyArray myArray) {
        caseInsensitiveCheck(myArray);
        
    }

    private HashMap<String, String> inSensitiveMap(){

        HashMap<String, String> map = new HashMap<>();
        String[] britishToAmerican;
        String mapFile = spellCheckInput;//.readFileAsString();

        britishToAmerican = mapFile.split(",");

        for(String bToA : britishToAmerican){
            String[] words = bToA.split(":");
            map.put(words[0], words[1]);
        }

        return map;
        
    }

    public void caseInsensitiveCheck(MyArray myArray){

        HashMap<String, String> inSensitiveMap = inSensitiveMap();
        ArrayList<String> first = new ArrayList<>();
        for(Iterator<String> it = (Iterator<String>) myArray.getIterator(); it.hasNext();){
            String sentence = it.next();

            String[] words = sentence.split(" ");

            String swapWords = " ";

            for(int i=0; i< words.length; i++){
                if(inSensitiveMap.containsKey(words[i])){
                    swapWords += inSensitiveMap.get(words[i]);
                }else{
                    swapWords += words[i];
                }

                if(i != words.length-1){
                    swapWords += " ";
                }
            }

            swapWords += ".";
            first.add(swapWords);
        }
        try {
            bufferWrite.write("\n-------STRATEGY2: CASE-INSENSITIVE------\n");
            for(int i=0; i<first.size();i++){
                bufferWrite.write(first.get(i));
                bufferWrite.write("\n");
            }
        } catch (IOException e) {
            e.printStackTrace();
        }finally{

        }
    }
    
}

