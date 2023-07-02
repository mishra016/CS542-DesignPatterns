package visitorArray.myArray;

import java.util.ArrayList;
import java.util.Iterator;


import visitorArray.visitors.VisitorI;


public class MyArray {
    
    private  ArrayList<String> arrOfSentences;

    public MyArray(){
        arrOfSentences = new ArrayList<>();
    }

    public ArrayList<String> getArrOfSentences(){
        return arrOfSentences;
    }

    public void setArrOfSentences(ArrayList<String> sentences){
        this.arrOfSentences = sentences ;
    }

    
   public void accept(VisitorI visitor){
   visitor.visit(this);
   }


   public Iterator<String> getIterator(){
    return arrOfSentences.iterator();
   }
}

