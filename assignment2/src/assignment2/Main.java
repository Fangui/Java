/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package assignment2;

/**
 *
 * @author Use
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) 
    {
        boolean b;
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
        
        ModuleBinaryTree binaryTree = new  ModuleBinaryTree();
        
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
        binaryTree.add(mod11);
        binaryTree.add(mod12);
        binaryTree.add(mod13);
        binaryTree.add(mod14);
        binaryTree.add(mod15);
        
        binaryTree.add(mod0);
        binaryTree.add(mod5);
        binaryTree.add(mod10);
        binaryTree.add(mod14);
        
        if(binaryTree.size() == 16)
            System.out.println("Sucess in function size");
        
        if(binaryTree.getModule(mod0.getModuleID()) == mod0 )
            System.out.println("Sucess in getModule");
        
        System.out.println(binaryTree.getModules());
        
        binaryTree.remove("U0");
        binaryTree.remove("U1X");
        System.out.println(binaryTree.getModules());
        
    }
    
}
