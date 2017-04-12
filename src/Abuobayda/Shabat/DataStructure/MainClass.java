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
        System.out.println("==========Testing addToBack method===============");
        myList.addToBack(10);
        myList.addToBack(20);
        myList.addToBack(30);
        myList.display();
        
        System.out.println("==============Testing remove Back================");
        int val = myList.removeBack();
        myList.display();
        System.out.println("value of the  removed node: "+ val);
        
        System.out.println("=========Testing numOfItems method========");
        System.out.println("Number Of Item in the List: "+ myList.numOfItems());
        
    }
}
