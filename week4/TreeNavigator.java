public class TreeNavigator {

    /**
     * Print out a preorder traversal of a binary tree
     *
     * @param t root of the tree to be traversed
     */
  public static void preOrderTraversal(BinaryTree t) 
  {
    if(t != null)
    {
      System.out.print(t.data + " ");
      preOrderTraversal(t.left);
      preOrderTraversal(t.right);
    }
  }

    /**
     * Print out a postorder traversal of a binary tree
     *
     * @param t root of the tree to be traversed
     */
  public static void postOrderTraversal(BinaryTree t) 
  {
    if(t != null)
    {
      postOrderTraversal(t.left);
      postOrderTraversal(t.right);
      System.out.print(t.data + " ");
    }
  }

    /**
     * Print out a inorder traversal of a binary tree
     *
     * @param t root of the tree to be traversed
     */
  public static void inOrderTraversal(BinaryTree t)
  {
    if(t != null)
    {
      inOrderTraversal(t.left);
      System.out.print(t.data + " ");
      inOrderTraversal(t.right);
    }
  }

    /**
     * Count the leaves on a binary tree
     * @param t root of the tree to be examined
     * @return the number of leaves in the tree
     */
  public static int leafCount(BinaryTree t) 
  {
    if(t == null)
      return 0;

    if(t.left == null && t.right == null)
      return 1;

    return leafCount(t.left) + leafCount(t.right);
  }

    /**
     * Find the depth of a binary tree
     * @param t the root of the tree to be examined
     * @return depth of the tree
     */
  private static int max(int a, int b)
  {
    return a > b? a : b;
  }

  public static int depth(BinaryTree t)
  {
    if(t == null)
      return -1;
    return 1 + max(depth(t.left), depth(t.right)); 
  }


  public static boolean isStrictlyBinary(BinaryTree t)
  {
    if(t.left == null || t.right == null)
      return false;
     return isStrictlyBinary(t.left) && isStrictlyBinary(t.right);
  }
  public static boolean strictlyBinary(BinaryTree t)
  {
    if(t == null)
      return false;
    return isStrictlyBinary(t); 
  }
}

