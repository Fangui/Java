/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package polycalc;

import java.util.Iterator;

/**
 *
 * @author 16108849
 */


public class List 
{      
    private Node head;
    
    public Node get_head()
    {
        return this.head;
    }
    
    public void insertAtHead(Term data) 
    {
        Node newNode = new Node();
        newNode.data = data;
        newNode.next = head;
        head = newNode;
    }
    
    public static void insertAfter(Term data, Node insertPoint) 
    {
        Node newNode = new Node();
        newNode.data = data;
        newNode.next = insertPoint.next;
        insertPoint.next = newNode;
    }
    
    public void deleteHead()
    {
        head = head.next;
    }
    
    public void deleteAfter(Node deletePoint) 
    {
        deletePoint.next = deletePoint.next.next;
    }
    
    public void clear()
    {
        head = null;
    }
    
    public void add_Term(Term term)
    {
        if(term.getCoefficient() == 0)
            return;
        
        int power = term.getPower();
        
        if(head == null)
        {
            head = new Node();
            head.data = term;
            head.next = null;
            return;
        }
        
        Node curr = head, prev = null;
        Node ins = new Node();
        while(curr != null && curr.next != null && power < curr.data.getPower())
        {
            prev = curr;
            curr = curr.next;
        }
        if(curr != null)
        {
            if(curr.data.getPower() == term.getPower())
            {
                term = new Term(term.getCoefficient() + 
                                curr.data.getCoefficient(), power);
                curr.data = term;
                if(term.getCoefficient() == 0)
                {
                    if(prev != null)
                        prev.next = curr.next;
                    else
                        head = curr.next;
                }
                return;
            }
            ins.data = term;
            
            if(curr.data.getPower() < power)
            {
                ins.next = curr;
                if(prev == null)
                    head = ins;
                else
                    prev.next = ins;
                return;
            }
            if(curr.data.getPower() > power)
                curr.next = ins;
        }
    }

