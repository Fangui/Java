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
public class My_Poly implements Polynomial
{
    List list = new List();

    @Override
    public void addPoly(Polynomial poly)
    {
        for(Term term : poly)
            this.addTerm(term);       
    }
    
    @Override
    public void multiplyByPoly(Polynomial poly)
    {
        My_Poly res = new My_Poly();
        for(Term term : this)
            res.addTerm(term);
        
        this.clear();
        
        Term toAdd;
        
        for(Term term : res)
        {
            for(Term t : poly)
            {
                toAdd = new Term(term.getCoefficient() * t.getCoefficient(), 
                                 term.getPower() + t.getPower());
                this.addTerm(toAdd);
            }
        }
    }
    
    @Override
    public void clear()
    {
       list.clear();
    }
    
    @Override
    public void addTerm(Term term)
    {
        list.add_Term(term);
    }
    
    @Override
    public Iterator<Term> iterator() 
    {
      return new Itr(list.get_head());  
    }
    
    private class Itr implements Iterator<Term> 
    {
           private Node current;
        
           private Itr(Node start)
           {
               current = start;
           }

           @Override
           public boolean hasNext()
           {
               return current != null;
           }

           @Override
           public Term next()
           {
                 Term result = current.data;
                 current = current.next;
                 return result;
            }
    }
}
