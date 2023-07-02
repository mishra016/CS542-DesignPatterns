package visitorArray.util;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import visitorArray.myArray.MyArray;
import visitorArray.util.MyLogger.DebugLevel;
import visitorArray.visitors.KFrequentWordsVisitor;
import visitorArray.visitors.VisitorI;
import visitorArray.visitors.SpellCheckVisitor;




public class FileProcessor{
    private String inputFile;
    private String britAmerInputFile;
    private String topkResults;
    private String spellCheckrResults;
    private int topK;
    private int debugValue;
    

    public FileProcessor(String input1, String input2, String topKResultsIn, String spellCheckResultsIn,int topKIn, int debugValueIn) {
        this.inputFile = input1;
        this.britAmerInputFile = input2;
        this.topkResults = topKResultsIn;
        this.spellCheckrResults = spellCheckResultsIn;
        this.topK = topKIn;
        MyLogger.writeMessage("Created constructor", DebugLevel.CONSTRUCTOR);        
    }

    public void processVisitors(){
        MyArray myArray = new MyArray();
        String fileAsString = readFileAsString();
        String fileAsStringBtoA = readFileAsStringBtoA();
        List<String> sentences = new ArrayList<>(Arrays.asList(fileAsString.split("\\.")));
        myArray.setArrOfSentences((ArrayList<String>)sentences);

        VisitorI topKVisitorIn = new KFrequentWordsVisitor(topK, topkResults);
        VisitorI spellCheckIn = new SpellCheckVisitor(fileAsStringBtoA, spellCheckrResults);
        myArray.accept(topKVisitorIn);
        myArray.accept(spellCheckIn);
    
    }

        public String readFileAsString() { 
        String text = ""; 
        try { 
            text = new String(Files.readAllBytes(Paths.get(inputFile))); 
        } catch (IOException e) { 
            System.out.println("File Not Available");
            System.exit(0);
        } 
        
        return text; 
    
    }

    public String readFileAsStringBtoA() {
        String text = "";
        try {
            text = new String(Files.readAllBytes(Paths.get(britAmerInputFile)));
        } catch (IOException e) {
            System.out.println("File Not Available");
            System.exit(0);
        }

        return text;

    }

    }


