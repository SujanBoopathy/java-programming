/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package clsObj;

/**
 *
 * @author Saubali
 */
public class ClassOne extends ClassThree{
    protected String greet8="hello from dif pckg and sub class";
    public static void main(String args[]){
        ClassTwo obj=new ClassTwo();
        System.out.println(obj.i);
        ClassThree obj2=new ClassThree();
        System.out.println(obj2.greet7);
        obj.greeting();
        
    }
}

class ClassThree{
    protected String greet7="Hi from dif pckges ";
    public String greet6="hello from dif pckges";
}
