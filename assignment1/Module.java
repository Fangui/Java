/**
 *
 * @author 16108849
 */

package assignment1;

public class Module implements IModule
{
  private String ID;
  private String Name;

  public Module(String ID, String Name)
  {
    this.ID = ID;
    this.Name = Name;
  }
  
  @Override
  public String getModuleID()
  {
    return ID;
  }

  @Override
  public String getModuleName()
  {
    return Name;
  }
}
