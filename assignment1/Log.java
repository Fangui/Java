package assignment1;

/**
 *
 * @author 16108849
 */

public class Log 
{
  public void startCapacity(int capacity)
  {
    System.out.println("HashTable start capacity " + capacity);
  }
  
  public void endCapacity(int capacity)
  {
    System.out.println("HashTable end capacity " + capacity + "\n");
  }
  
  public void resize(int capacity)
  {
    System.out.println("Resize occur");
    System.out.println("capacity before resize: " + capacity);
  }
  
  public void afterResize(int capacity)
  {
    System.out.println("capacity after resize: " + capacity);
  }
  
  
  public void printAdd(Node node, int colision, int size, int capacity)
  {
    System.out.println("Add student");
    System.out.println("Id: " + node.data.getStudentID() + "| hash value: " 
                        + node.hkey);
    System.out.println("number of colision: " + colision);
    System.out.println("size after insersion: " + size);
    System.out.println("load factor: " + (float)size / (float) capacity + "\n");
  }
  
  public void printStudent(Node node, int colision, int index)
  {
    System.out.print("Get student: ");
    System.out.println("Id:" + node.data.getStudentID() + "|`hash value:" 
                        + node.hkey);
    System.out.println("index " + index + "| Number of colision: " 
                        + colision + "\n");
  }
  
  public void printRemove(Node node, int colision)
  {
    System.out.print("Remove Student: ");
    System.out.println("Id: " + node.data.getStudentID() + "| hash value:" 
                        + node.hkey);
    System.out.println("Number of colision: " + colision + "\n");
  }
  
  public void printRemoveFail(String ID)
  {
    System.out.println("Remove Student with " + ID + " ID fail, not on the"
                      + " hashTable\n");
  }
  
  public void addUpdate(String module, int nb, int size, int height)
    {
        System.out.println("Insertion " + module + ", update tree");
        System.out.println("Number of tree node visited for adding : " + nb);
        System.out.println("new Size : " + size + " , new Height : " + height);
        System.out.println();
    }
    
    public void addFailUpdate(String module, int nb, int size, int height)
    {
        System.out.println("Fail insertion " + module + ", ID already insert");
        System.out.println("Number of tree node visited : " + nb);
        System.out.println("Size : " + size + " , Height : " + height + "\n");
    }
    
    public void getUpdate(String module, int nb)
    {
        System.out.println("Get " + module);
        System.out.println("Number of tree node visited to get " + nb + "\n");
    }
    
    public void getFailUpdate(String module)
    {
        System.out.println("Fail getting " + module + ", node is not on tree");
        System.out.println();
    }
    
    public void removeStart(Tree tree)
    {
       System.out.println("Start remove " + tree.mod.getModuleID());
       if(tree.left == null && tree.right == null)
           System.out.println("Node delete is a leaf");
       else if(tree.left != null && tree.right == null)
           System.out.println("Node delete has a left child");
       else if(tree.left == null && tree.right != null)
           System.out.println("Node has a right child");
       else
           System.out.println("Node has two children");
    }
    
    public void removeUpdate(String module, int nb, int size, int height)
    {
        System.out.println("Remove " + module + ", update tree");
        System.out.println("Number of tree node visited for remove : " + nb);
        System.out.println("new Size : " + size + " , new Height : " + height);
        System.out.println();
    }
    
     public void removeFailUpdate(String module)
    {
        System.out.println("Fail removing " + module +"; module ID "
                            + "not on the tree \n");
    }
     
     
}
