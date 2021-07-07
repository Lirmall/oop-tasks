package oop.tasks.t2.person.tasks;

class Person {
    private String fullName;
    private int age;

    public Person() throws IncorrectAgeException {
        this.setFullName(null);
        this.setAge(0);
    }

    public Person(String fullName, int age) throws IncorrectAgeException {
        this.setFullName(fullName);
        this.setAge(age);
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) throws IncorrectAgeException {
        if (age < 0 || age > 130) {
            throw new IncorrectAgeException();
        }
        this.age = age;
    }

    public void move() {
        System.out.println(getFullName() + " walks");
    }

    public void talk() {
        System.out.println(getFullName() + " says");
    }
}
