package assignment2;

/**
 *
 * 16108849
 */
public class ModuleBinaryTree
{
    private Tree tree;
    
    public void add(Module module)
    {
        
        Tree ins = new Tree(module);
        if(tree == null)
            tree = ins;
        
        Tree root = tree;
        while(root != null)
        {
            int cmp = 
            module.getModuleID().compareToIgnoreCase(root.mod.getModuleID());
            
            if(cmp > 0)
            {
                if(root.right == null)
                {
                    root.right = ins;
                    root = null;
                }
                else
                    root = root.right;
            }
            else if (cmp < 0)
            {
                if(root.left == null)
                {
                    root.left = ins;
                    root = null;
                }
                else
                    root = root.left;
            }
            else
                root = null;
        }
    }
    
    public void clear()
    {
        tree = null;
    }
    
    
    
    
    public boolean isEmpty()
    {
        return tree == null;
    }
}
