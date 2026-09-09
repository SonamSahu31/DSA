package Constructer;
import java.util.Scanner;

public class Inheritance {
     public static class Animal {
        public void makeSound() {
            System.out.println("Some generic animal sound");
        }

        static class Dog extends Animal {
            @Override
            public void makeSound() {
                System.out.println("Woof!");
            }
        }
     }    
    public static void main(String[] args) {
        Animal myDog = new Animal.Dog();
        myDog.makeSound(); // Output: Woof!

        System.out.println("Is myDog an instance of Dog? " + (myDog instanceof Dog)); // Output: true
    
    }

    
    
}
