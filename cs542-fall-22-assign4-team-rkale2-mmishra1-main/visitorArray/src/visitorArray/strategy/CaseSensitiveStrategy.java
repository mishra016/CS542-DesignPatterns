package visitorArray.strategy;

import java.io.BufferedWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;

import visitorArray.myArray.MyArray;
import visitorArray.util.Results;

public class CaseSensitiveStrategy implements StrategyI {

    private String spellCheckInput;
    private String output2File;
    private BufferedWriter bufferWrite;

    Results res = new Results();
    public CaseSensitiveStrategy(String output2FileIn, String spellCheckInput2, BufferedWriter BwIn){
        this.spellCheckInput = spellCheckInput2;
        this.output2File = output2FileIn;
        this.bufferWrite = BwIn;
      
    }

    public void setStrategy(MyArray myArray){
        caseSensitiveCheck(myArray);
    }

    private HashMap<String, String> sensitiveMap(){

        HashMap<String, String> map = new HashMap<>();
        String[] britishToAmerican;
        String mapFile = spellCheckInput; //readFileAsString();
        
        britishToAmerican = mapFile.split(",");

        for(String bToA : britishToAmerican){
            String[] words = bToA.split(":");
            map.put(words[0].toLowerCase(), words[1]);
        }

        return map;
        
    }

    public void caseSensitiveCheck(MyArray myArray){

        HashMap<String, String> sensitiveMap = sensitiveMap();
        ArrayList<String> second = new ArrayList<>();
        for(Iterator<String> it = (Iterator<String>) myArray.getIterator(); it.hasNext();){
            String sentence = it.next();

            String[] words = sentence.split(" ");

            String swapWords = " ";
            for(int i=0; i< words.length; i++){
                if(sensitiveMap.containsKey(words[i])){
                    swapWords += sensitiveMap.get(words[i]);
                }else{
                    swapWords += words[i];
                }

                if(i != words.length-1){
                    swapWords += " ";
                }
            }

            swapWords += ".";
            second.add(swapWords);
        }

        //System.out.println("-------STRATEGY1: CASE- SENSITIVE------");
        try {
            bufferWrite.write("-------STRATEGY1: CASE- SENSITIVE------\n");
            for(int i=0; i<second.size();i++){
                bufferWrite.write(second.get(i));
                bufferWrite.write("\n");
                //System.out.println(second.get(i));
            }
        } catch (IOException e) {
            e.printStackTrace();
        }finally{

        }
    }
    
}
