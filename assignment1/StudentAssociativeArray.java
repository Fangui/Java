public class StudentAssociativeArray implements IStudentAssociativeArray
{
  private Node arrStudent[];
  private int capacity;
  private int size;

  public StudentAssociativeArray(int capacity)
  {
    arrStudent = new Node[capacity];
    this.capacity = capacity;
    size = 0;
  }

  public void clear()
  {
    size = 0;
    arrStudent = null;
  }

  private int hash(String key)
  {
    return Math.abs(key.hashCode());
  }

  public boolean containsStudentID(String studentID)
  {
    int h = hash(studentID);
    int index = h % capacity;

    Node p = arrStudent[index];

    while(p != null && h != p.hkey && studentID != p.data.getStudentID() )
      p = p.next;

    return p != null;
  }

  public boolean containsValue(Student student)
  {
    int index = hash(student.getName() ) % capacity;

    Node pair = arrStudent[index];

    while(pair != null  && student != pair.data )
      pair = pair.next;

    return pair != null;
  }

  public Student getStudent(String studentID)
  {
    int h = hash(studentID);
    int index = h % capacity;

    Node p = arrStudent[index];

    while(p != null && h != p.hkey && studentID != p.data.getStudentID())
      p = p.next;

    return p.data;
  }

  public boolean isEmpty()
  {
    return size == 0;
  }

/*  public Collection<String> keySet()
  {
    if( (float)size / (float)capacity > 0.75)
    {
      
    }
  }
*/
  public int size()
  {
    return size;
  }
}








