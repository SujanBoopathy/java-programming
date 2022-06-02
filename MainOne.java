/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Abstraction;

/**
 *
 * @author Saubali
 */
abstract class Base{
    Base(){
        System.out.println("Base class called");
    }
    abstract void fun();
}

class Derived extends Base{
    Derived(){
        System.out.println("Derived class called");
    }
    void fun(){
        System.out.println("Fun method executed");
    }
}

public class MainOne {
    public static void main(String args[]){
        Derived derived=new Derived();
        derived.fun();
    }
}
