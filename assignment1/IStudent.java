package assignment1;
import java.util.Collection;

/**
 *
 * @author 16108849
 */
 
public interface IStudent {

    /**
     * Enrols the Student on a Module
     * @pre true
     * @param module the Module to be enrolled
	 * DO NOT IMPLEMENT FOR COURSEWORK 1
     */
//    public void addModule(Module module);

    /**
     * Retrieves the Student's enrolled course
     * @pre true
     * @return the Student's enrolled course
     */
    public String getCourse();

    /**
     * Retrieves the Student's full name
     * @pre true
     * @return the Student's full name
     */
    public String getName();

    /**
     * Retrieves a Collection view of the Modules the Student is currently
     * enrolled on.
     * @pre true
     * @return a Collection view of the Modules the Student is currently enrolled
     * on
	 * DO NOT IMPLEMENT FOR COURSEWORK 1
     */
    public Collection<Module> getModules();

    /**
     * Retrieves the Student's student ID
     * @pre true
     * @return the students ID
     */
    public String getStudentID();

    /**
     * Removes a Module matching the supplied module ID from the Student
     * @pre true
     * @param moduleID the module ID of the Module to remove
     * @return the removed Module matching the supplied module ID, or null if
     * the module ID is not found
	 * DO NOT IMPLEMENT FOR COURSEWORK 1
     */
//    public Module removeModule(String moduleID);
}
