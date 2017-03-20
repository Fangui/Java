package week7;

/**
 *
 16108849
 */
public class TreeUtils {
    
    public static WordTree recordWord(WordTree tree, String word, int lineNo)
    {
        WordTree ins = new WordTree(word, lineNo);
        if(tree == null)
            return ins;
        
        int cmp;
        WordTree root = tree;
        
        while(root != null)
        {
            cmp = word.compareToIgnoreCase(root.word);
            if(cmp > 0)
            {
                if(root.right == null) // if there is no child at the right we add the tree at this place
                {
                    root.right = ins;
                    return tree;
                }
                else
                    root = root.right;
            }
            else if (cmp < 0)
            {
                if(root.left == null)
                {
                    root.left = ins;
                    return tree;
                }
                else
                    root = root.left;
            }
            else
            {
                root.lineNumbers.add(lineNo); //we find the string so we just need to add lieNO
                return tree;
            }
        }
        return tree; //should never enter in this case
    }

    public static void display(WordTree tree) 
    {
        if(tree != null)
        {
            display(tree.left);
            System.out.print(tree.word + " ");
            display(tree.right);
        }
    }


    public static int numberOfEntries(WordTree tree) 
    {
        if(tree == null)
            return 0;
        return 1 + numberOfEntries(tree.left) + numberOfEntries(tree.right);        
    }

}
