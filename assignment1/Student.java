package assignment1;
import java.util.Collection;


/**
 *
 * @author 16108849
 */

public class Student implements IStudent
{
  private String Course;
  private String Name;
  private String ID;
  ModuleBinaryTree tree;
  
  public Student(String Course, String Name, String ID)
  {
    this.Course = Course;
    this.Name = Name;
    this.ID = ID;
    tree = new ModuleBinaryTree();
  }

  @Override
  public void addModule(Module module)
  {
      tree.add(module);
  }
  
  @Override
  public String getCourse()
  {
    return Course;
  }

  @Override
  public Collection<Module> getModules()
  {
      return tree.getModules();
  }
  
  @Override
  public String getName()
  {
    return Name;
  }

  @Override
  public String getStudentID()
  {
    return ID;
  }
  
  @Override
  public Module removeModule(String moduleID)
  {
      return tree.remove(moduleID);
  }
}
