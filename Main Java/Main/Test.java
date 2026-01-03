class Animal {
    public void walk() { System.out.println("Animal walks"); }
    
    public void move() {
        walk();  // Calls Animal's private walk()
    }
}

class Dog extends Animal {
    public void walk() { System.out.println("Dog walks"); }
}

public class Test {
    public static void main(String[] args) {
        Animal a = new Dog();
        a.move();  // Calls Animal's move(), which calls Animal's walk()
    }
}
