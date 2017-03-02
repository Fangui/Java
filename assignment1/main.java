//import IStudent;
//import IModule;

public class main
{
  public static void main(String[] args)
  {
      Module test = new Module("16108849", "data_structure");
      System.out.print(test.getModuleID() + '\n' + test.getModuleName() + '\n');

       Student test2 = new Student("data_struct", "Bruh", "1610");
       System.out.print(test2.getCourse() + '\n' + test2.getName() + '\n' + test2.getStudentID() + '\n');

  }  
}

