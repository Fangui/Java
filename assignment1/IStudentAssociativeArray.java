package assignment1;

import java.util.Collection;

/**
 *
 * @author 16108849
 */
 
public interface IStudentAssociativeArray {
    
    
    public void printHash();
    
    public int getCapacity();
    
     /**
     * Empties the associative array.
     * @pre true
     */
    public void clear();
    
    /**
     * Determines whether a Student ID exists as a key inside the associative
     * array.
     * @pre true
     * @param studentID The student id (key) to locate
     * @return true iff the studentID exists as a key in the associative array
     */
    public boolean containsStudentID(String studentID);
        
    
    /**
     * Determines whether a Student object exists as a value inside the associative
     * array.
     * @pre true
     * @param student The Student object to locate
     * @return true iff the Student object 'student' exists as a value in the associative array
     */
    public boolean containsValue(Student student);
    
    /**
     * Returns a Student object mapped to the supplied studentID.
     * @pre true
     * @param studentID The student id (key) to locate
     * @return the Student object mapped to the key studentID if the studentID
     * exists as key in the associative array, otherwise null
     */
    public Student getStudent(String studentID);
    
    /**
     * Determines if the associative array is empty or not.
     * @pre true
     * @return true iff the associative array is empty
     */
    public boolean isEmpty();
    
    /**
     * Returns a Collection view of the Student IDs (keys) contained by the associative
     * array
     * @pre true
     * @return a Collection view of the Student IDs (keys) contained by the associative
     * array
     */ 
    public Collection<String> keySet();
    
    /**
     * Inserts a Student into the associative array, with the key of the supplied
     * Student's studentID.
     * Note: If the studentID already exists as a key, then then the original entry is
     * overwritten.
     * @pre true
     */
    public void put(Student student);
    
    /**
     * Removes and returns a Student from the associative array, with the key
     * the supplied studentID.
     * @param studentID The student id (key) to remove.
     * @pre true
     * @return the removed Student object mapped to the studentID, or null if
     * the studentID does not exist.
    */
    public Student remove(String studentID);
    
    /**
     * Returns the number of Students in the associative array
     * @pre true
     * @return number of Students in the associative array. 0 if empty
     */
    public int size();
    
    /**
     * Returns a Collection view of the Students contained by the associative
     * array
     * @pre true
     * @return a Collection view of Student objects contained by the associative
     * array
     */
//    public Collection<Student> getStudents();
    
}
