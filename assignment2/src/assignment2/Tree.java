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
public class Tree 
{
    Module mod;
    Tree left, right;
    
    
    public Tree(Module mod)
    {
        this.mod = mod;
        left = null;
        right = null;
    }
}
