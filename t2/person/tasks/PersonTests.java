package oop.tasks.t2.person.tasks;

public class PersonTests {
    public static void main(String[] args) throws IncorrectAge {
        testIncorrectAge();
    }

    private static void testIncorrectAge() {
        try {
            Person person2 = new Person("John Smith", -42);
        } catch (IncorrectAge e) {
            return;
        }
        assert false;
    }
}
