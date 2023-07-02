package visitorArray.visitors;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Iterator;
import java.util.PriorityQueue;

import visitorArray.myArray.MyArray;
import visitorArray.util.Results;




public class KFrequentWordsVisitor implements VisitorI {

    private int K;
    private String outputKFile;
    public Results result = new Results();
    

    public KFrequentWordsVisitor(int KIn, String outputKFileIn){
        this.K = KIn;
        this.outputKFile = outputKFileIn;
    }



    @Override
    public void visit(MyArray myArray) {
        HashMap<String,Integer> map = new HashMap<>();
        String[] topK = new String[K];

        for(Iterator<String> iterator = myArray.getIterator(); iterator.hasNext();){
            String sentence = iterator.next();

            String[] words = sentence.split(" ");
            
            for(String word: words){
                if(!map.containsKey(word)){
                    map.put(word, 0);
                }else{
                    int counter = map.get(word);
                    map.put(word, counter+1);
                }
                
            }
        }

        ArrayList<String> sortedWords = new ArrayList<>();
        PriorityQueue<String> priority = new PriorityQueue<>(new Comparator<String>() {

        @Override
        public int compare(String word1, String word2) {
            if(map.get(word1) ==  map.get(word2)){
                return word1.compareTo(word2);
            }
            return map.get(word1) - map.get(word2);

        }
    });
    
    for(String wKey: map.keySet()){
        priority.add(wKey);
        if(priority.size()> K){
            priority.poll();
        }
    }
    
    while(!priority.isEmpty()){
        sortedWords.add(priority.poll());
    }
    
    Collections.reverse(sortedWords);
    try{
    for (int i= 0; i<K; i++){
        topK[i] = (String)sortedWords.get(i);
    }
}catch(Exception exception){
    
}finally{

}

    StringBuilder stringB = new StringBuilder();
    stringB.append("Most-freq-word: "+ topK[0]).append(" \n");
    for(int i=1; i<K; i++){
        stringB.append((i+1)+ " Most-freq-word: "+ topK[i]).append(" \n");
    }

    result.writeTopKFile(outputKFile, stringB.toString());
}
}