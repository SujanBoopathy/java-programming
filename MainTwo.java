/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Abstraction;

/**
 *
 * @author Saubali
 */
abstract class Base2{
    void fun(){
        System.out.println("fun method from abstract base class");
    }
}
class Derived2 extends Base2{
    
}
public class MainTwo {
    public static void main(String args[]){
        Derived2 derived2=new Derived2();
        derived2.fun();
    }
}
