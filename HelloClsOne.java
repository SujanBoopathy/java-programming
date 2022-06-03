/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package accessSpecifier;
import clsObj.*;
/**
 *
 * @author Saubali
 */

public class HelloClsOne {
    public static void main(String args[]){
        HelloClsThree obj=new HelloClsThree();
        //Same package but subclass, private variable can't be accessed;
        System.out.println(obj.greeting());
        System.out.println(obj.greet2);
        System.out.println(obj.greet3);
        System.out.println(obj.greet4);
        System.out.println(obj.greet5);
        
        ClassOne obj2=new ClassOne();
        System.out.println(obj2.greet6);
        //different package non-sub class protected variable
        //System.out.println(obj2.greet7);
        

        
        
    }
}
