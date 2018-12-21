package Trees;
public class BinarySearchTree{
    BSTNode root;
    int val;
    BSTNode left;
    BSTNode right;

    public BinarySearchTree(){
    }

    public BinarySearchTree(int val){
        this.root = new BSTNode(val);
    }


    public void insert(int newVal){
        root = insert(root, newVal);
    }

    private BSTNode insert(BSTNode root, int newVal){
    }

    public void inOrderTraversal(){
        inOrderTraversal(root);
    }

    private void inOrderTraversal(BSTNode root){

    }

    public void preOrderTraversal(){
        preOrderTraversal(root);
    }

    private void preOrderTraversal(BSTNode root){

    }

    public void postOrderTraversal(){
        postOrderTraversal(root);
    }

    private void postOrderTraversal(BSTNode root){

    }

    public int getHeight(){
        return getHeight(root);
    }

    public int getHeight(BSTNode root){
    }

    public int getSize(){
        return getSize(root);
    }

    private int getSize(BSTNode root){
    }
}