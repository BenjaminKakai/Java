public class OOPDemo {
    public static void main(String[] args) {
        Animal genericAnimal = new Animal("Generic Animal");
        Dog buddy = new Dog("Buddy");

        genericAnimal.sound();
        buddy.sound();
    }
}
