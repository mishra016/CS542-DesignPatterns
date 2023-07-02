package visitorArray.visitors;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

import visitorArray.myArray.MyArray;
import visitorArray.strategy.StrategyI;
import visitorArray.strategy.CaseInsensitiveStrategy;
import visitorArray.strategy.CaseSensitiveStrategy;
import visitorArray.util.FileProcessor;


public class SpellCheckVisitor implements VisitorI {

    private String spellCheckInput;
    private String output2File;

    public SpellCheckVisitor(String fileAsStringBtoA, String outputSwapFileIn){
        spellCheckInput = fileAsStringBtoA;
        this.output2File = outputSwapFileIn;
    }


    @Override
    public void visit(MyArray myArray){
        //Results results = new Results();
        try (//results.writeWordSwapping(output2File);
        FileWriter fw = new FileWriter(output2File)) {
            BufferedWriter bw = new BufferedWriter(fw);

            CaseSensitiveStrategy sensitiveStrategy = new CaseSensitiveStrategy(output2File, spellCheckInput, bw);
            CaseInsensitiveStrategy insensitiveStrategy = new CaseInsensitiveStrategy(output2File, spellCheckInput, bw);

            checkStrategy(myArray, sensitiveStrategy);
            checkStrategy(myArray, insensitiveStrategy);
            
            try {
                bw.close();
            } catch (IOException e) {

                e.printStackTrace();
            }finally{

            }
        } catch (IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        finally{

        }
        
    }

    private void checkStrategy(MyArray myArray, StrategyI strategy){
        strategy.setStrategy(myArray);
        //strategy.setStrategy(myArray);
    }

    
}
