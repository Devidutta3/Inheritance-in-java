class Animal {
    void eat() {
        System.out.println("I am eating");
    }

    void bark() {
        System.out.println("Barking......");
    }
}

class Dog extends Animal {

    public static void main(String[] args) {
        Dog obj = new Dog();   // Child class object

        obj.eat();   // Parent class method
        obj.bark();  // Parent class method
    }
}
