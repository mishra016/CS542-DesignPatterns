package studentRecordsBackupTree.bst;
import studentRecordsBackupTree.ObserverPattern.SubjectInterface;
import studentRecordsBackupTree.ObserverPattern.ObserverInterface;
import java.util.ArrayList;


public class Node implements SubjectInterface, ObserverInterface{

    private int bNumber;
    private String description;
    private Node left;
    private Node right;
    private ArrayList<Node>BNum;

    
    public Node(int bNumber){
        this.bNumber = bNumber;
        this.description = "The description of B-number is: "+ this.bNumber;
        this.left = null;
        this.right = null;
        this.BNum= new ArrayList<>();
    }


    public int getBNumber() {
        return bNumber;
    }

    public void setBNumber(int bNumber) {
        this.bNumber = bNumber;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Node getLeft(){
        return left;
    }

    public void setLeft(Node leftIn){

        this.left = leftIn;
    }

    public void setRight(Node rightIn){

        this.right = rightIn;
    }

    public Node getRight(){

        return right;
    }

    public void setBNum(ArrayList<Node> BNum) {
        this.BNum = BNum;
    }

    public ArrayList<Node> getBNum() {
        return BNum;
    }


    @Override
    public void registerObserver(Node observer) {
        BNum.add(observer);
    }

    @Override
    public void unregisterObserver(Node observer) {
        BNum.remove(observer);
    }

    @Override
    public void notifyObserver() {
        for(Node obj: BNum){
            obj.update(this.bNumber);
        }
    }

    @Override
    public void update(int value) {
        this.bNumber = this.bNumber+value;
    }

}
