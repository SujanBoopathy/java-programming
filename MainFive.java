/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Abstraction;

/**
 *
 * @author Saubali
 */


//Nested Abstract class
abstract class B{
    abstract class C{
        abstract void fun();
    }
}

class D extends B{
    class E  extends C{
        void fun(){
            System.out.println("fun() methods from nested abstract class");
        }
    }
}
public class MainFive {
    public static void main(String args[]){
        D outer =new D();
        D.E inner=outer.new E();
        inner.fun();
    }
}
