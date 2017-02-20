import java.util.LinkedList;
import java.util.ListIterator;


public class hash
{ 
  public static void main(String[] args)
  { 
    final int HTS = 12; //hash table size
    LinkedList[] staff=new LinkedList[HTS];
    for(int i=0; i<HTS; i++)
        staff[i]=new LinkedList();
    addStaff(staff,"Sharon");
    addStaff(staff,"Chris");
    addStaff(staff,"Ian");
    addStaff(staff,"David");
    addStaff(staff,"Peter");
    addStaff(staff,"Muhammad");
    addStaff(staff,"Arantza");
    addStaff(staff,"Ken");
    addStaff(staff,"Richard");
    addStaff(staff,"Hong");
    addStaff(staff,"William");
    addStaff(staff,"Mark");
    addStaff(staff,"Bob");
    addStaff(staff,"Clare");
    addStaff(staff,"Faye");
    ListIterator iterator=staff[0].listIterator();
    for(int i=0; i<HTS; i++)
    { 
      iterator=staff[i].listIterator();
      System.out.print("staff["+i+"]: ");
      while (iterator.hasNext())
        System.out.print(iterator.next()+" ");
      System.out.println();
    }
    System.out.print(checkKey(staff, "Bob") + "\n");
    System.out.print(checkKey(staff, "pattrick") + "\n");
    System.out.print(loadFactor(staff, HTS )); 
  }
  private static int hash(String key)
  { 
    final int HTS = 12; //hash table size
    return Math.abs(key.hashCode()%HTS);
  }

  private static boolean checkKey(LinkedList[] staff, String key)
  {
    LinkedList list = staff[hash(key)];
    return list.contains(key);
  }

  private static void addStaff(LinkedList[] staff, String key)
  { 
    final int HTS = 12;
    if(!check_Key(staff, key))
      staff[hash(key)].addLast(key);
  }

  private static double loadFactor(LinkedList[] staff, final int HTS)
  {
    ListIterator iterator;
    double cpt = 0;
    for(int i = 0; i < HTS; ++i)
    {
      iterator = staff[i].listIterator();
      for(; iterator.hasNext(); iterator.next())
        ++cpt;
    }
    return cpt / (double)(HTS);
  }

} 
