package assignment1;

/**
 *
 * @author 16108849
 */

public class Main
{
  public static void main(String[] args)
  {
    Student student1 = new Student("Omelette", "Noemi", "16104494");
    Student student2 = new Student("Cuisine", "Castelo", "16108885");
    Student student3 = new Student("Procrastiner", "Jesus", "16108894");
    Student student4 = new Student("CorrectDeadlyMistakeS","Vicky", "16105587");
    Student student5 = new Student("SonnerChezIdriss", "Corsica", "16108802");
    Student student6 = new Student("MangerMarmite", "Lioby", "16108858");
    Student student7 = new Student("GeniusProg", "Blue", "16106484");
    Student student8 = new Student("Debugueur", "Fang", "16108849");
    Student student9 = new Student("Chickenn", "Vince", "16108860");
    Student student10 = new Student("Theatre", "Elie", "16108869");
    Student student;
    Student nul;
    
    Log log = new Log();
    
    StudentAssociativeArray hashtab = new StudentAssociativeArray(1);
    log.startCapacity(hashtab.getCapacity() );
    
    hashtab.put(student1);
    hashtab.put(student2);
    student = hashtab.remove(student1.getStudentID());
    hashtab.remove(student1.getStudentID());
    boolean b = hashtab.containsStudentID(student1.getStudentID());
    boolean b2 = hashtab.containsStudentID(student2.getStudentID());
    if(b || !b2)
      System.out.println("Function containsStudentID does not work");
    
    b = hashtab.containsValue(student1);
    b2 = hashtab.containsValue(student2);
    if(b || !b2)
      System.out.println("Function containsValue does not work");
    
    hashtab.put(student3);
    hashtab.put(student4);
    hashtab.put(student5);
    hashtab.put(student6);
    hashtab.put(student1);
    hashtab.put(student7);
    hashtab.put(student8);
    hashtab.put(student9);
    hashtab.put(student10);
    
    hashtab.printHash();
    hashtab.keySet();
    
    hashtab.remove(student2.getStudentID());
    nul = hashtab.remove("65464");
    
    if(nul != null || student != student1)
      System.out.println("function remove does not work");
    
   student = hashtab.getStudent(student1.getStudentID());
   if(student != student1)
     System.out.println("function get student does not work");
   
   
   hashtab.clear();
   hashtab.printHash();
   
   log.endCapacity(hashtab.getCapacity());

  }  
}

