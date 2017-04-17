package assignment1;

/**
 *
 * @author 16108849
 */
public class Main {

    public static void main(String[] args) {
        Module mod0 = new Module("U0", "Maths");
        Module mod1 = new Module("U84", "English");
        Module mod2 = new Module("U156", "Physic");
        Module mod3 = new Module("U2591", "DataStructure");
        Module mod4 = new Module("U8496", "Graphic");
        Module mod5 = new Module("U684", "Technology");
        Module mod6 = new Module("U9718", "Law");
        Module mod7 = new Module("U8434", "Management");
        Module mod8 = new Module("U9642", "Philosophy");
        Module mod9 = new Module("U36584", "French");
        Module mod10 = new Module("U7136", "Sport");
        Module mod11 = new Module("U5841", "Algorithm");
        Module mod12 = new Module("U1X", "Driving");
        Module mod13 = new Module("U317", "Cooking");
        Module mod14 = new Module("U8746", "Music");
        Module mod15 = new Module("U138", "Art");
        
        ModuleBinaryTree binaryTree = new ModuleBinaryTree();
        if(!binaryTree.isEmpty())
            System.out.println("Function isEmpty does not work");
        
        binaryTree.add(mod0);
        binaryTree.add(mod1);
        binaryTree.add(mod2);
        binaryTree.add(mod3);
        binaryTree.add(mod4);
        binaryTree.add(mod5);
        binaryTree.add(mod6);
        binaryTree.add(mod7);
        binaryTree.add(mod8);
        binaryTree.add(mod9);
        binaryTree.add(mod10);
        
        binaryTree.getModule(mod11.getModuleID());
        binaryTree.add(mod11);
        binaryTree.getModule(mod11.getModuleID());
        binaryTree.remove(mod12.getModuleID());
        binaryTree.getModule(mod11.getModuleID());
        binaryTree.add(mod11);
        
        binaryTree.add(mod12);
        binaryTree.add(mod13);
        binaryTree.add(mod14);
        binaryTree.add(mod15);
        
        binaryTree.add(mod0);
        binaryTree.add(mod1);
        binaryTree.add(mod2);
        binaryTree.add(mod3);
        binaryTree.add(mod4);
        binaryTree.add(mod5);
        binaryTree.add(mod6);
        binaryTree.add(mod7);
        binaryTree.add(mod8);
        binaryTree.add(mod9);
        binaryTree.add(mod10);
        binaryTree.add(mod12);
        binaryTree.add(mod13);
        binaryTree.add(mod14);
        binaryTree.add(mod15);
        
        System.out.println(binaryTree.getModules());
        
        binaryTree.getModule(mod0.getModuleID());
        binaryTree.getModule(mod1.getModuleID());
        binaryTree.getModule(mod2.getModuleID());
        binaryTree.getModule(mod3.getModuleID());
        binaryTree.getModule(mod4.getModuleID());
        binaryTree.getModule(mod5.getModuleID());
        binaryTree.getModule(mod6.getModuleID());
        binaryTree.getModule(mod7.getModuleID());
        binaryTree.getModule(mod8.getModuleID());
        binaryTree.getModule(mod9.getModuleID());
        binaryTree.getModule(mod10.getModuleID());
        binaryTree.getModule(mod11.getModuleID());
        binaryTree.getModule(mod12.getModuleID());
        binaryTree.getModule(mod13.getModuleID());
        binaryTree.getModule(mod14.getModuleID());
        binaryTree.getModule(mod15.getModuleID());
        
        binaryTree.remove(mod0.getModuleID());
        binaryTree.remove(mod0.getModuleID());
        binaryTree.getModule(mod0.getModuleID());
        binaryTree.remove(mod1.getModuleID());
        binaryTree.getModule(mod1.getModuleID());
        binaryTree.remove(mod2.getModuleID());
        binaryTree.getModule(mod2.getModuleID());
        binaryTree.remove(mod3.getModuleID());
        binaryTree.getModule(mod3.getModuleID());
        binaryTree.remove(mod4.getModuleID());
        binaryTree.getModule(mod4.getModuleID());
        binaryTree.remove(mod5.getModuleID());
        binaryTree.remove(mod5.getModuleID());
        binaryTree.getModule(mod5.getModuleID());
        binaryTree.remove(mod6.getModuleID());
        binaryTree.getModule(mod6.getModuleID());
        binaryTree.remove(mod7.getModuleID());
        binaryTree.getModule(mod7.getModuleID());
        binaryTree.remove(mod8.getModuleID());
        binaryTree.getModule(mod8.getModuleID());
        binaryTree.remove(mod9.getModuleID());
        binaryTree.getModule(mod9.getModuleID());
        binaryTree.remove(mod10.getModuleID());
        
        binaryTree.remove(mod10.getModuleID());
        System.out.println(binaryTree.getModules());
        if(binaryTree.getModule(mod11.getModuleID()) ==
           binaryTree.remove(mod11.getModuleID()) &&
           binaryTree.getModule(mod12.getModuleID()) ==
           binaryTree.remove(mod12.getModuleID()) &&
           binaryTree.getModule(mod13.getModuleID()) ==
           binaryTree.remove(mod13.getModuleID()) &&
           binaryTree.getModule(mod14.getModuleID()) ==
           binaryTree.remove(mod14.getModuleID()) &&
           binaryTree.getModule(mod15.getModuleID()) ==
           binaryTree.remove(mod15.getModuleID()))
            System.out.println("Succes in getting the remove module \n");
        
        

         if(binaryTree.isEmpty())
             System.out.println("All element has been delete with succes");
       
        binaryTree.add(mod6);
        binaryTree.add(mod7);
        binaryTree.add(mod8);
        binaryTree.add(mod9);
        
        if (binaryTree.size() == 4) {
            System.out.println("Sucess in function size");
        }

        if (binaryTree.getModule(mod6.getModuleID()) == mod6 &&
            binaryTree.getModule(mod7.getModuleID()) == mod7 &&
            binaryTree.getModule(mod8.getModuleID()) == mod8 &&
            binaryTree.getModule(mod9.getModuleID()) == mod9)
                System.out.println("Sucess in getting module");
        
        binaryTree.clear();
        if(!binaryTree.isEmpty())
            System.out.println("Function clear doesn't work");
        System.out.println(binaryTree.getModules());
        
        
        Student student1 = new Student("OmeletteSalé", "Noemi", "16104494");
        Student student2 = new Student("Cuisine", "Castelo", "16108885");
        Student student3 = new Student("Procrastiner", "Jesus", "16108894");
        Student student4 = new Student("CorrectMistakeS", "Vicky", "16105587");
        Student student5 = new Student("SonnerIdriss", "Corsica", "16108802");
        Student student6 = new Student("MangerMarmite", "Lioby", "16108858");
        Student student7 = new Student("GeniusProg", "Blue", "16106484");
        Student student8 = new Student("Debugueur", "Fang", "16108849");
        Student student9 = new Student("Chickenn", "Vince", "16108860");
        Student student10 = new Student("Theatre", "Elie", "16108869");
        Student student;
        Student nul;

        Log log = new Log();
        
        student1.addModule(mod0);
        student1.addModule(mod1);
        student1.addModule(mod2);
        student1.addModule(mod3);
        student1.addModule(mod4);
        student1.addModule(mod5);
        student1.addModule(mod6);
        student1.addModule(mod7);
        student1.addModule(mod8);
        student1.addModule(mod9);
        student1.addModule(mod10);
        student1.addModule(mod11);
        student1.addModule(mod12);
        student1.addModule(mod13);
        student1.addModule(mod14);
        student1.addModule(mod15);
        
        
        student2.addModule(mod4);
        student2.addModule(mod5);
        student2.addModule(mod6);
        
        student3.addModule(mod6);
        student3.addModule(mod7);
        student3.addModule(mod8);
        
        student4.addModule(mod9);
        student4.addModule(mod10);
        student4.addModule(mod11);
        
        student5.addModule(mod12);
        student6.addModule(mod13);
        student7.addModule(mod14);
        student8.addModule(mod15);
        student9.addModule(mod1);
        
        StudentAssociativeArray hashtab = new StudentAssociativeArray(1);
        log.startCapacity(hashtab.getCapacity());

        hashtab.put(student1);
        hashtab.put(student2);
        student = hashtab.remove(student1.getStudentID());
        nul = hashtab.remove(student1.getStudentID());
        
        if(student == null && nul != null)
            System.out.println("Fail getting the remove student");
        
        hashtab.remove(student1.getStudentID());
        boolean b = hashtab.containsStudentID(student1.getStudentID());
        boolean b2 = hashtab.containsStudentID(student2.getStudentID());
        if (b || !b2) {
            System.out.println("Function containsStudentID does not work");
        }

        b = hashtab.containsValue(student1);
        b2 = hashtab.containsValue(student2);
        if (b || !b2) 
            System.out.println("Function containsValue does not work");
        
        hashtab.put(student1);
        hashtab.put(student3);
        hashtab.put(student4);
        hashtab.put(student5);
        hashtab.put(student6);
        hashtab.put(student7);
        hashtab.put(student8);
        hashtab.put(student9);
        hashtab.put(student10);
        
        if(hashtab.size() != 10)
            System.out.println("Function does not work\n");
        
        hashtab.getStudent(student1.getStudentID());
        hashtab.getStudent(student3.getStudentID());
        hashtab.getStudent(student5.getStudentID());
        hashtab.getStudent(student7.getStudentID());
        hashtab.getStudent(student9.getStudentID());

        hashtab.printHash();
        System.out.println(hashtab.keySet() + "\n");

        if(hashtab.remove(student1.getStudentID()) == student1 &&
           hashtab.remove(student2.getStudentID()) == student2 &&
           hashtab.remove(student3.getStudentID()) == student3 &&
           hashtab.remove(student4.getStudentID()) == student4 &&
           hashtab.remove(student5.getStudentID()) == student5 &&
           hashtab.remove(student6.getStudentID()) == student6 &&
           hashtab.remove(student7.getStudentID()) == student7 &&
           hashtab.remove(student8.getStudentID()) == student8)
            System.out.println("Success in getting all the remove students\n");
            
        hashtab.printHash();
        System.out.println(hashtab.keySet() + "\n");
        
        nul = hashtab.remove(student1.getStudentID());

        if (nul != null || student != student1)
            System.out.println("function remove does not work");
        

        student = hashtab.getStudent(student9.getStudentID());
        if (student != student9)
            System.out.println("function get student does not work");
        
        hashtab.put(student1);
        hashtab.put(student2);
        hashtab.put(student3);
        hashtab.put(student4);
        hashtab.put(student5);
        hashtab.put(student6);
        hashtab.put(student7);
        hashtab.put(student8);
        
        if(student1 == hashtab.getStudent(student1.getStudentID()) &&
           student2 == hashtab.getStudent(student2.getStudentID()) &&
           student3 == hashtab.getStudent(student3.getStudentID()) &&
           student4 == hashtab.getStudent(student4.getStudentID()) &&
           student5 == hashtab.getStudent(student5.getStudentID()) &&
           student6 == hashtab.getStudent(student6.getStudentID()) &&
           student7 == hashtab.getStudent(student7.getStudentID()) &&
           student8 == hashtab.getStudent(student8.getStudentID()) &&
           student9 == hashtab.getStudent(student9.getStudentID()) &&
           student10 == hashtab.getStudent(student10.getStudentID()))
            System.out.println("Success getting student in the hashtable\n");
        
        System.out.println("student2 modules");
        System.out.println(student2.getModules() + "\n");
        
        if(student2.removeModule(mod4.getModuleID()) != mod4 ||
           student2.removeModule(mod5.getModuleID()) != mod5 ||
           student2.removeModule(mod5.getModuleID()) != null)
            System.out.println("error value return when remove\n");
        
        System.out.println("student2 modules");
        System.out.println(student2.getModules() + "\n");
        
        System.out.println("Student1 modules");
        System.out.println(student1.getModules() + "\n");
        if(student1.getCourse() == 
           hashtab.getStudent(student1.getStudentID()).getCourse() &&
           student1.getName() == 
           hashtab.getStudent(student1.getStudentID()).getName() &&
           student1.removeModule(mod1.getModuleID()).getModuleName() ==
           mod1.getModuleName() &&
           student1.removeModule(mod2.getModuleID()).getModuleID() == 
           mod2.getModuleID() && 
           student1.removeModule(mod3.getModuleID()) == mod3 &&
           student1.removeModule(mod4.getModuleID()) == mod4 &&
           student1.removeModule(mod5.getModuleID()) == mod5 &&
           student1.removeModule(mod6.getModuleID()) == mod6 &&
           student1.removeModule(mod7.getModuleID()) == mod7 &&
           student1.removeModule(mod8.getModuleID()) == mod8 &&
           student1.removeModule(mod9.getModuleID()) == mod9 &&
           student1.removeModule(mod10.getModuleID()) == mod10 &&
           student1.removeModule(mod11.getModuleID()) == mod11 &&
           student1.removeModule(mod12.getModuleID()) == mod12 &&
           student1.removeModule(mod13.getModuleID()) == mod13 &&
           student1.removeModule(mod14.getModuleID()) == mod14 &&
           student1.removeModule(mod15.getModuleID()) == mod15 &&
           student1.removeModule(mod0.getModuleID()) == mod0 &&
           student1.tree.isEmpty() && student1.tree.size() == 0)
            System.out.println("Success while getting the remove value\n");

        hashtab.clear();
        hashtab.printHash();
        System.out.println(hashtab.keySet() + "\n");
        
        if(hashtab.size() != 0)
            System.out.println("Function size does not work");

        log.endCapacity(hashtab.getCapacity());

    }
}
