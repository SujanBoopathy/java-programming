/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package List;
import java.util.*;

/**
 *
 * @author Saubali
 */
public class ListPractice {
    public static void main(String args[]){
        List<String> list1=new ArrayList<String>();
        list1.add("Apple");
        list1.add("Mango");
        list1.add("Orange");
        System.out.println("Creating simple list: ");
        for(String lang:list1){
            System.out.println(lang);
        }
        
        System.out.println("Conversion of List to Array and vice versa");
        //Converting array to list
        String progLang[]={"c","c++","java","python"};
        System.out.println("Printing Array :"+Arrays.toString(progLang));
        
        List<String> progLangList=new ArrayList<String>();
        for(String lang: progLang){
            progLangList.add(lang);
        }
        System.out.println("Printing List: "+progLangList);
        
        
        //Converting list to array
        
        List<String> fruitList=new ArrayList<String>();
        fruitList.add("apple");
        fruitList.add("mango");
        
        String fruit[]=fruitList.toArray(new String[fruitList.size()]);
        System.out.println("Fruit :"+Arrays.toString(fruit));
        
        //get and set Items in List
        System.out.println("Accessing the element in list :");
        System.out.println(progLangList.get(1));
        progLangList.set(1,"php");
        System.out.println(progLangList.get(1));
        
        
        //Sorting the list
        System.out.println("Sorted list :");
        Collections.sort(progLangList);
        System.out.println(progLangList);
        
        
        //List Iterator
        List<String> emp=new ArrayList<String>();
        emp.add("sujan");
        emp.add("arun");
        emp.add("vishal");
        emp.add("vicky");
        
        ListIterator<String> itr=emp.listIterator();
        System.out.println("Traverse the list in forward direction :");
        while(itr.hasNext()){
            System.out.println("Index :"+itr.nextIndex()+"\t Value :"+itr.next());
        }
        System.out.println("Traverse the list in backward direction :");
        while(itr.hasPrevious()){
            System.out.println("Index : "+itr.nextIndex()+"\t Value :"+itr.previous());
        }
        
        
    }
}
