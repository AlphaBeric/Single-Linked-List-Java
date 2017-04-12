/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Abuobayda.Shabat.DataStructure;

/**
 *
 * @author absha
 */
public interface NodeInterface<T> {
    public void setNext(ListNode n);
    public ListNode getNext();
    public void setItem(T item);
    public T getItem();
    
    
}
