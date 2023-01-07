import java.util.HashMap;

public class People {
    private HashMap<String, Integer> people;

    public People() {
        // Initialize an empty HashMap
        people = new HashMap<>();
    }

    public void addPerson(String name, int age) {
        // Add a key-value pair to the HashMap
        people.put(name, age);
    }

    public void removePerson(String name) {
        // Remove a key-value pair from the HashMap
        people.remove(name);
    }

    public int getAge(String name) {
        // Return the age for a given name
        return people.get(name);
    }

    public void updateAge(String name, int age) {
        // Update the age for a given name
        people.put(name, age);
    }

    public static void main(String[] args) {
        // Initialize a People object
        People people = new People();

        // Add some people to the HashMap
        people.addPerson("Alice", 25);
        people.addPerson("Bob", 30);
        people.addPerson("Eve", 35);

        // Get the age of a person
        int age = people.getAge("Bob");
        System.out.println(age);  // Output: 30

        // Update the age of a person
        people.updateAge("Bob", 32);
        age = people.getAge("Bob");
        System.out.println(age);  // Output: 32

        // Remove a person from the HashMap
        people.removePerson("Alice");
    }
}
