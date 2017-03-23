package assignment1;

import java.util.Vector;
import java.util.Collection;

/**
 *
 * @author 16108849
 */

public class StudentAssociativeArray implements IStudentAssociativeArray
{
  private Node arrStudent[];
  private int capacity;
  private int size;
  private final int TAB[] = new int[]{98, 6, 85,150, 36, 23,112,164,135,207,169,  
  5, 26, 64,165,219, 61, 20, 68, 89,130, 63, 52,102, 24,229,132,245, 80,
  216,195,115, 90,168,156,203,177,120, 2,190,188,  7,100,185,174,243,162, 10, 
  237, 18,253,225, 8, 208,172,244,255,126,101, 79,145,235,228,121,
  123,251, 67,250,161,0,107, 97,241,111,181, 82,249, 33, 69, 55,
  59,153, 29,  9,213,167, 84, 93, 30, 46, 94, 75,151,114, 73,222, 
  197, 96,210, 45, 16,227,248,202, 51,152,252,125, 81,206,215,186,
  39,158,178,187,131,136,  1, 49, 50, 17,141, 91, 47,129, 60, 99, 
  154, 35, 86,171,105, 34, 38,200,147, 58, 77,118,173,246, 76,254, 
  133,232,196,144,198,124, 53, 4,108, 74,223,234,134,230,157,139, 
  189,205,199,128,176, 19,211,236,127,192,231, 70,233, 88,146, 44, 
  183,201, 22, 83, 13,214,116,109,159, 32, 95,226,140,220, 57, 12, 
  221, 31,209,182,143, 92,149,184,148, 62,113, 65, 37, 27,106,166, 
  3, 14,204, 72, 21, 41, 56, 66, 28,193, 40,217, 25, 54,179,117, 
  238, 87,240,155,180,170,242,212,191,163, 78,218,137,194,175,110, 
  43,119,224, 71,122,142, 42,160,104, 48,247,103, 15, 11,138,239};
  //Wikipedia (Random array)
  
  public StudentAssociativeArray(int capacity)
  {
    arrStudent = new Node[capacity];
    this.capacity = capacity;
    size = 0;
  }

  @Override
  public void clear()
  {
    size = 0;
    arrStudent = new Node[capacity];
  }

  private int hash(String key)
  {
    int len = key.length();
    int hash = len % 255;

    for(int i = 0; i < len; ++i)
      hash += TAB[(hash ^ (int)key.charAt(i)) % 255];

    return hash;
  }

  @Override
  public boolean containsStudentID(String studentID)
  {
    int h = hash(studentID);
    int index = h % capacity;

    Node p = arrStudent[index];

    while(p != null && h != p.hkey && studentID != p.data.getStudentID() )
      p = p.next;

    return p != null;
  }

  @Override
  public boolean containsValue(Student student)
  {
    int index = hash(student.getStudentID() ) % capacity;

    Node pair = arrStudent[index];

    while(pair != null  && student != pair.data )
      pair = pair.next;

    return pair != null;
  }

  @Override
  public Student getStudent(String studentID)
  {
    int h = hash(studentID);
    int index = h % capacity;
    int colision = 0;
    Log log = new Log();

    Node p = arrStudent[index];

    while(p != null && h != p.hkey && studentID != p.data.getStudentID())
    {
      ++colision;
      p = p.next;
    }
    if(p != null)
    {
      log.printStudent(p, colision, index);
      return p.data;
    }
    return null;
  }

  @Override
  public boolean isEmpty()
  {
    return size == 0;
  }

  @Override
  public Collection <String> keySet()
  {
    Collection<String> arr =  new Vector<String>();
    int j = 0;
    Node p;

    for(int i = 0; i < capacity && j < size; ++i)
    {
      p = arrStudent[i];
      while(p != null)
      {
        arr.add(p.data.getStudentID());
        p = p.next;
        ++j;
      }
    }
    return arr;
  }

  @Override
  public void put(Student student)
  {
    int h, index, coli = 0;
    Node p, pair, ins;
    Log log = new Log();
    if((float)size / (float)capacity >= 0.75)
    {
      log.resize(capacity);
      StudentAssociativeArray htab = new StudentAssociativeArray(2 * capacity);
      for(int i = 0; i < capacity; ++i)
      {
        p = arrStudent[i];
        while(p != null)
        {
          index = p.hkey % (2 * capacity);
          ins = new Node();
          ins.data = p.data;
          ins.hkey = p.hkey;
          ins.next = null;

          pair = htab.arrStudent[index];
          if(pair == null)
            htab.arrStudent[index] = ins;
          else
          {
            while(pair.next != null)
              pair = pair.next;
            pair.next = ins;
          }
          p = p.next;
        }
      }
      capacity = htab.capacity;
      arrStudent = htab.arrStudent;
      log.afterResize(capacity);
    }
    h = hash(student.getStudentID());
    index = h % capacity;
    System.out.println("hash value " + h);
    p = arrStudent[index];
    ins = new Node();
    ins.data = student;
    ins.hkey = h;
    ins.next = null;
    if(p == null)
      arrStudent[index] = ins;
    else
    {
      ++coli;
      while(p.next != null)
      {
        if(p.hkey == h && p.data.getStudentID() == student.getStudentID() )
        {
          p.data = student;
          System.out.println(coli + " colision");
          return;
        }
        p = p.next;
      }
      p.next = ins;
    }
    ++size;
    log.printAdd(ins, coli, size, capacity);
  }

  @Override
  public Student remove(String studentID)
  {
    int h = hash(studentID);
    int index = h % capacity;
    int coli = 0;
    Node p = arrStudent[index], prev = null;
    Student student = null;
    Log log = new Log();

    while(p != null && p.hkey != h && p.data.getStudentID() != studentID)
    {
      ++coli;
      prev = p;
      p = p.next;
    }
    if(prev == null)
    {
      if(p != null)
      {
        student = p.data;
        arrStudent[index] = p.next;
        --size;
        log.printRemove(p, coli);
        return student;
      }
    }
    if(p != null)
    {
      student = p.data;
      prev.next = p.next;
      --size;
      log.printRemove(p, coli);
    }
    return student;
  }
  
  @Override
  public int size()
  {
    return size;
  }
  
  @Override
  public int getCapacity()
  {
    return capacity;
  }
  @Override
  public void printHash()
  {
    for(int i = 0; i < capacity; ++i)
    {
      Node p = arrStudent[i];
      if(p != null)
        System.out.println("new node index " + i);

      while(p != null)
      {
        System.out.println(p.data.getStudentID() +" " + p.data.getName());
        p = p.next;
      }
    }
    System.out.println();
  }
}
