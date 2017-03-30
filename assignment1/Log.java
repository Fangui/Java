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
}
