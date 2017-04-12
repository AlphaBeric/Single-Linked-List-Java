/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Abuobayda.Shabat.DataStructure;

/**
 *
 * @author Abuobayda Shabat
 */
public class MainClass {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        SListInterface<Integer> myList = new SList<Integer>();
        myList.addToBack(10);
        myList.addToBack(20);
        myList.addToBack(30);
        myList.display();
        
    }
}
