
package studentRecordsBackupTree.bst;
import studentRecordsBackupTree.util.Results;

import java.io.BufferedWriter;
import java.io.IOException;

public class BST {
    private Node root;
    private BufferedWriter bf;

    public BST(){
        this.root=null;
    }

    public void insert(int newData){
        this.root=insert(root, newData);
    }

    public Node insert(Node rootIn, int newData) {
        if (rootIn == null) {
            rootIn = new Node(newData);
            return rootIn;
        } else if (rootIn.getBNumber()>newData) {
            rootIn.setLeft(insert(rootIn.getLeft(),newData));
        }else{
            rootIn.setRight(insert(rootIn.getRight(),newData));
        }
        return rootIn;
    }

    Results results = new Results();
    /*public void inorderRecur(Node rootIn)  {
        // return if the current node is empty
        if (rootIn == null) {
            return;
        }
        // Traverse the left subtree
        inorderRecur(rootIn.getLeft());

        // Display the data part of the root (or current node)
        System.out.print(rootIn.getBNumber() + ",");
        //results.displayToFile(rootIn);


        // Traverse the right subtree
        inorderRecur(rootIn.getRight());
    }*/
    public void inorderRecur(Node rootIn, StringBuilder stringBuilderIn)  {
        // return if the current node is empty
        if (rootIn == null) {
            return;
        }
        // Traverse the left subtree
        inorderRecur(rootIn.getLeft(), stringBuilderIn);

        // Display the data part of the root (or current node)
        stringBuilderIn.append(rootIn.getBNumber()).append(", ");
        //results.displayToFile(rootIn);


        // Traverse the right subtree
        inorderRecur(rootIn.getRight(), stringBuilderIn);
    }
      public StringBuilder inorder(StringBuilder stringBuilderIn){
        inorderRecur(root, stringBuilderIn);
        return stringBuilderIn;
      }

//    public void inorder() throws IOException {
//        inorderRecur(root);
//    }

    /* Function to find sum
   of all the elements*/

    public int addBST(Node temp){
        int sum=0, sumLeft=0, sumRight=0;

        //Check whether tree is empty
        if(root == null) {
            System.out.println("Tree is empty");
            return 0;
        }
        else {
            //Calculate the sum of nodes present in left subtree
            if(temp.getLeft() != null)
                sumLeft = addBST(temp.getLeft());

            //Calculate the sum of nodes present in right subtree
            if(temp.getRight()!= null)
                sumRight = addBST(temp.getRight());

            //Calculate the sum of all nodes by adding sumLeft, sumRight and root node's data
            sum = temp.getBNumber() + sumLeft + sumRight;
            return sum;
        }
    }
    public Node getRoot() {
        return root;
    }


}
