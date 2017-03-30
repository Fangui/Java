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

  public Student(String Course, String Name, String ID)
  {
    this.Course = Course;
    this.Name = Name;
    this.ID = ID;
  }

  @Override
  public String getCourse()
  {
    return Course;
  }

  @Override
  public Collection<Module> getModules()
  {
      return null;
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
}
