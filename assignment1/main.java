public class main
{
  public static void main(String[] args)
  {
    Student student1 = new Student("Latin", "Noemi", "16104494");
    Student student2 = new Student("Cuisine", "Castelo", "1610849");
    Student student3 = new Student("Procrastiner", "Jesus", "5159595");
   
    StudentAssociativeArray hashtab = new StudentAssociativeArray(2);
    hashtab.put(student1);
    hashtab.put(student2);
    hashtab.put(student3);
    hashtab.printHash(); 

    hashtab.remove("16104494");
    hashtab.remove("1610849");
    Student nul = hashtab.remove("65464");
    boolean b = nul == null;
    System.out.print(b + "\n");
    hashtab.printHash();
  }  
}

