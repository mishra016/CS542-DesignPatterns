
package studentRecordsBackupTree.bst;


public class BST {
    private Node root;

    
    public BST(){
        this.root=null;
    }

    
    public void insert(int newData){
        this.root=insert(root, newData);
    }

    /* Function to insert the B-number as nodes in the tree*/
    /**
     * @param rootIn takes in the root value
     * @param newData takes the value to compare with root and assign either to right or left
     * @return Bst with the values inserted in the nodes
     */
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

    /* Function to do Inorder Traversal(Sorting) the elements*/

    /**
     * @param rootIn
     * @param stringBuilderIn
     */
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

    /* Function to Update the Value in the Tree while traversing*/
    public void updateRecur(Node rootIn, int updateValue){
        if (rootIn == null) {
            return;
        }

        // Traverse the left subtree
        updateRecur(rootIn.getLeft(), updateValue);

        // updateNode using SetBNumber with updated value
        rootIn.setBNumber(rootIn.getBNumber()+updateValue);
        //notify all the observers
        rootIn.notifyObserver();
       
        // Traverse the right subtree
        updateRecur(rootIn.getRight(), updateValue);
    }

    public void updateMain(int updateValue){
        updateRecur(root,updateValue);
    }
    

    /* Function to find sum of all the elements*/
    /**
     * @param key
     * @return the sum of all the nodes combined together
     */
    public int addBST(Node key){
        int sum=0, sumLeft=0, sumRight=0;

        //Check whether tree is empty
        if(root == null) {
            System.out.println("Tree is empty");
            return 0;
        }
        else {
            //Calculate the sum of nodes present in left subtree
            if(key.getLeft() != null)
                sumLeft = addBST(key.getLeft());

            //Calculate the sum of nodes present in right subtree
            if(key.getRight()!= null)
                sumRight = addBST(key.getRight());

            //Calculate the sum of all nodes by adding sumLeft, sumRight and root node's data
            sum = key.getBNumber() + sumLeft + sumRight;
            return sum;
        }
    }


    /**
     * @return root
     */
    public Node getRoot() {
        return root;
    }

}
