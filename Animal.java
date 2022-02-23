import java.lang.Override;

public class Animal {
     void eatSomething() {
         System.out.println("Eat Something");
     }
    }
     class Dog extends Animal{
         @Override
         void eatSomething() {
             System.out.println("Eatting Foods");
         }
     }

     class TestAnnotaion{
         public static void main(String[] args){
             Animal a = new Dog();
             a.eatSomething();
         }
     }

