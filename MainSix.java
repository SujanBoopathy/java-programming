/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Abstraction;

/**
 *
 * @author Saubali
 */
abstract class Demo{
    abstract void methodOne();
    abstract void methodTwo();
    abstract void methodThree();
}
abstract class FirstChild extends Demo{
    @Override
    public void methodOne(){
        System.out.println("Method One executed");
    }
}
class SecondChild extends FirstChild{
    @Override
    void methodTwo(){
        System.out.println("Method Two executed");
    }
    @Override
    void methodThree(){
        System.out.println("Method three executed");
    }
}
public class MainSix {
    public static void main(String args[]){
        SecondChild object=new SecondChild();
        object.methodOne();
        object.methodTwo();
        object.methodThree();
    }
}
