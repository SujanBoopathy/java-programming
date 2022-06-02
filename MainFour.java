/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Abstraction;

/**
 *
 * @author Saubali
 */
abstract class Base4{
    static void fun(){
        System.out.println("static Fun() method ");
    }
}
public class MainFour extends Base4{
    public static void main(String args[]){
        Base4.fun();
    }
}
