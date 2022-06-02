/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Abstraction;

/**
 *
 * @author Saubali
 */
abstract class Base3{
    //Cannot override this method
    final void fun(){
        System.out.println("final fun() method ");
    }
}
class Derived3 extends Base3{

}
public class MainThree {
    public static void main(String args[]){
        Derived3 derived3=new Derived3();
        derived3.fun();
    }
}
