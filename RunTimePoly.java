/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package polymorphism;

/**
 *
 * @author Saubali
 */
class BaseClass{
    void print(){
        System.out.println("Base class");
    }
}
class DerivedClass extends BaseClass{
    void print(){
        System.out.println("Derived class");
    }
}
public class RunTimePoly {
    public static void main(String args[]){
        DerivedClass obj=new DerivedClass();
        obj.print();
        
        BaseClass obj2=new DerivedClass();
        obj2.print();
    }
}
