/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package inheritance;

/**
 *
 * @author Saubali
 */
class Animal{
    void eat(){
        System.out.println("Eating");
    }
}

//Single level inheritence
class Cat extends Animal{
    void intro(){
        System.out.println("I am cat");
    }
}
//hierarchical level inheritence
class Dog extends Animal{
    void intro(){
        System.out.println("I am dog");
    }
}

class DogTwo extends Dog{
    void intro2(){
        System.out.println("I am dog 2");
    }
}
public class Inheritance {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println("Hello");
        
        //Single Level Inheritence
        Cat cat=new Cat();
        cat.intro();
        cat.eat();
        
        Dog dog=new Dog();
        dog.intro();
        dog.eat();      
        
        //multi-level inheritance
        DogTwo dog2=new DogTwo();
        dog2.intro();
        dog2.intro2();
        
    }
    
}
