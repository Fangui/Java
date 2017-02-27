public class StudentAssociativeArray implements IStudentAssociativeArray
{
  private Vector<Student> arrStudent;

  public void clear()
  {
    arrStudent = null;
  }

  public boolean containsStudentID(String studentID)
  {
    for(int i = 0; i < arrStudent.capacity(); ++i)
      if(arrStudent[i].getStudentID() == studentID)
        return true;

    return false;
  }

  public boolean containsValue(Student student)
  {
    return arrStudent.contains(student);
  }

  public Student getStudent(String studentID)
  {
    for(int i = 0; i < arr.Student.capacity(); ++i)
      if(arrStudent[i].getStudentID() == studentID)
        return arrStudent[i];

    return null;
  }

  public boolean isEmpty()
  {
    return arrStudent.isEmpty();
  }

  
}
