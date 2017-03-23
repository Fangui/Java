import javax.swing.*;
import java.awt.image.*;
import java.util.*;

public class TreePlay {

    public static void main(String[] args) {

        // creates a binary tree with some random numbers in it
        BinaryTree t = TreeUtilities.createRandomTree();

        System.out.println("PREORDER TRAVERSAL");
        TreeNavigator.preOrderTraversal(t);

        System.out.println("\nPOSTORDER TRAVERSAL");
        TreeNavigator.postOrderTraversal(t);

        System.out.println("\nINORDER TRAVERSAL");
        TreeNavigator.inOrderTraversal(t);

        System.out.println("\nLEAF COUNT = " + TreeNavigator.leafCount(t));

        System.out.println("DEPTH = " + TreeNavigator.depth(t));

        System.out.print("isStrictlyBinary ");
        System.out.println(TreeNavigator.strictlyBinary(t));

        // shows a pop-up window displaying tree t
        TreeUtilities.showTree(t);

        // keep the following line as the last line of the main method
        System.exit(0); // <- exits the program immediately
        // (the above line is handy if there's an invisible pop-up window
        // still hanging about preventing the program from terminating)

    }
}

