/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package polymorphism;

/**
 *
 * @author Saubali
 */
class Product{
    static int multiply(int a,int b){
        return a*b;
    }
    static double multiply(double a,double b){
        return a*b;
    }
    static float multiply(float a,float b){
        return a*b;
    }
    static int multiply(int a,int b,int c){
        return a*b*c;
    }
}
public class CompileTimePoly {
    public static void main(String args[]){
        Product obj=new Product();
        System.out.println(obj.multiply(3,4));
        System.out.println(obj.multiply(9.8,98.2));
        System.out.println(obj.multiply(4,4,4));
        
    }
}
