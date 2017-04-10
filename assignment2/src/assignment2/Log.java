/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package assignment2;

/**
 *
 * 16108849
 */
public class Log {
    
    public void addUpdate(String module, int nb, int size, int height)
    {
        System.out.println("Insertion " + module + ", update tree");
        System.out.println("Number of tree node visited for adding : " + nb);
        System.out.println("new Size : " + size + " , new Height : " + height);
        System.out.println();
    }
    
    public void addFailUpdate(String module, int nb, int size, int height)
    {
        System.out.println("Fail insertion " + module + ", ID already insert");
        System.out.println("Number of tree node visited : " + nb);
        System.out.println("Size : " + size + " , Height : " + height + "\n");
    }
    
}
