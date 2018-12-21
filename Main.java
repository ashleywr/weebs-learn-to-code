
import java.util.Random;

public class Main {
    public static void main(String[] args) {
        BST bst = new BST(25);
        bst.insert(9);
        bst.insert(16);

        Random rand = new Random();
        for(int i = 0; i < 10; i++){
            int  n = rand.nextInt(50) + 1;
            bst.insert(n);
        }

        bst.inOrderTraversal();
        System.out.println("size " + bst.getSize());
        System.out.println("height " + bst.getHeight());
    }
}
