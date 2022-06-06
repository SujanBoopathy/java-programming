/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DSA;

/**
 *
 * @author Saubali
 */
import java.util.*;

public class LinkedListInf {
    public static void main(String args[]){
        LinkedList<String> ll=new LinkedList<>();
        ll.add("Sujan");
        ll.addFirst("arun");
        ll.addLast("hello");
        ll.add("hi");
        ll.add("world");
        
        System.out.println(ll);
        
       
       ll.remove("arun");
       System.out.println("After removing specific element, the linked list :\n"+ll);
       ll.remove(2);
       System.out.println("After removing the element at index 2 , the linked list :\n"+ll);
       ll.removeFirst();
       System.out.println("After removing first element , the linked list :\n"+ll);
       ll.removeLast();
       System.out.println("After removing last element , the linked list :\n"+ll);
       
       
                
    }
}
