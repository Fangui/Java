public class StudentAssociativeArray implements IStudentAssociativeArray
{
  private Vector<Node> arrStudent;
  private int capacity;
  private int size;

  public void clear()
  {
    arrStudent = null;
  }

  private int hash(String key)
  {
    return Math.abs(key.hashcode());
  }

  public boolean containsStudentID(String studentID)
  {
    int h = hash(studentID);
    int index = h % capacity;

    Node p = arrStudent[index];

    while(p != null && h != p.hkey && studentID != Node.data.getStudentID())
      p = p->next;

    return p != null;
  }

  public boolean containsValue(Student student)
  {
    int index = hash(student) % capacity;

    Node pair = arrStudent[index];

    while(pair != null  && student != Node.data)
      pair = pair->next;

    return pair != null;
  }

  public Student getStudent(String studentID)
  {
    int h = hash(studentID);
    int index = h % capacity;

    Node p = arrStudent[index];

    while(p != null && h != p.hkey && studentID != Node.data.getStudentID())
      p = p->next;

    return p;
  }

  public boolean isEmpty()
  {
    return arrStudent.isEmpty();
  }

/*  public Collection<String> keySet()
  {
    if( (float)size / (float)capacity > 0.75)
    {
      
    }
  }
*/

}








