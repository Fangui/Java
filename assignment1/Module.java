public class Module implements IModule
{
  private String ID;
  private String Name;

  public Module(String _ID, String _Name)
  {
    this.ID = _ID;
    this.Name = _Name;
  }

  public String getModuleID()
  {
    return ID;
  }

  public String getModuleName()
  {
    return Name;
  }

  public static void main(String[] args)
  {
    Module test = new Module("16108849", "data_structure");
    System.out.print(test.getModuleID());
  }
}
