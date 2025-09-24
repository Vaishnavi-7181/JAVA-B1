public class Simpleclass {
    String type = "Dog"; // instance variable

    void sound() { // method
        System.out.println("The " + type + " barks.");
    }

    public static void main(String[] args) {
        Animal a = new Animal();
        a.sound();
    }
}
