package poly;

class Animal{
    
    String name;
    String sound;

    void makeSound() {
        System.out.println(" This is Animal class ");
    }
    void display(){
        String result = String.format("Name: %s, Sound: %s", name, sound);
        System.out.println(result);
    }
}

class Cat extends Animal{
    int legs;


    void makeSound() {
        System.out.println(" Meow ");
    }
}

public class MainPoly {
    public static void main(String[] args) {
        
    }
}
