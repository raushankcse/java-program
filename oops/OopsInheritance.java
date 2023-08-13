package oops;

public class OopsInheritance {
    public static void main(String args[])
    {
        Fish f = new Fish();
        f.eat();
        f.swim();
    }
    
}

class Animal{
    String color;
    void eat(){
        System.out.println("eats");
    }
    void breathe()
    {
        System.out.println("breathe");
    }
}

// class Fish extends Animal{
//     int fins;
//     void Swim()
//     {
//         System.out.println("Swim");
//     }
// }


// multilevel inheritance

// class mammal extends Animal{
//     int legs;
// }

// class Dog extends mammal{
//     String breed;
// }


// Hierarchical Inheritance

class mammal extends Animal{
    void walk()
    {
        System.out.println("walks");
    }
}

class Fish extends Animal{
    void swim()
    {
        System.out.println("swim");
    }
}

class Bird extends Animal{
    void fly()
    {
        System.out.println("fly");
    }
}