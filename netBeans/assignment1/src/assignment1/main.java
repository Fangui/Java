package assignment1;

public class main
{
  public static void main(String[] args)
  {
    Student student1 = new Student("Omelette", "Noemi", "16104494");
    Student student2 = new Student("Cuisine", "Castelo", "16108885");
    Student student3 = new Student("Procrastiner", "Jesus", "16108894");
    Student student4 = new Student("CorrectDeadlyMistakeS", "Vicky", "14285787");
    Student student5 = new Student("SonnerChezIdriss", "Corsica", "16108802");
    Student student6 = new Student("MangerMarmite", "Lioby", "16108858");
    
 
    StudentAssociativeArray hashtab = new StudentAssociativeArray(1);
    hashtab.put(student1);
    hashtab.put(student2);
    hashtab.printHash();
    hashtab.put(student3);
    hashtab.put(student4);
    hashtab.put(student5);
    hashtab.put(student6);

    hashtab.printHash(); 
    hashtab.keySet();
    hashtab.remove(student1.getStudentID());
    hashtab.remove("1610849");
    hashtab.remove("65464");

    hashtab.printHash();
  }  
}

