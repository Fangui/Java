public class Module implements IModule
{
  private String ID;
  private String Name;

  public Module(String ID, String Name)
  {
    this.ID = ID;
    this.Name = Name;
  }

  public String getModuleID()
  {
    return ID;
  }

  public String getModuleName()
  {
    return Name;
  }

}
