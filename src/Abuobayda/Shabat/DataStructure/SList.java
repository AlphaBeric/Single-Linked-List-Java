/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Abuobayda.Shabat.DataStructure;

/**
 *
 * @author Abuobyda Shabat
 */
public class SList<T> implements SListInterface<T> {
    ListNode head;
    int numOfItem;
    
    SList(){
        head = null;
        numOfItem = 0;
    }

    @Override
    public void addToFront(T item) {
        head = new ListNode(item,head);
        numOfItem++;
    }

    @Override
    public T removeFront() {
        T value = null;
        if(!isEmpty()){
            value = (T) head.getItem();
            head = head.getNext();
        }
        
        return value;
    }

    @Override
    public void addToBack(T item) {
        ListNode current = head;
        int cnt = 1;
        while(current!=null && cnt < numOfItem){
            current = current.getNext();
            cnt++;
        }
        
        if (current!=null){
            ListNode newNode = new ListNode(item);
            current.setNext(newNode);
            numOfItem++;
            
        }
        else{
            addToFront(item);
        }
    }

    @Override
    public T removeBack() {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public ListNode contain(int position) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public boolean isEmpty() {
        return head==null;
    }

    @Override
    public void clear() {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public void display() {
        ListNode current = head;
        while(current!=null){
            System.out.println(current.getItem());
            current = current.getNext();
        }
    }
    
}
