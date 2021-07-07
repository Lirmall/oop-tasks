package oop.tasks.t1.phone.tasks;

//по вот этой ссылке, первое задание https://www.examclouds.com/ru/java/java-core-russian/lesson7-tasks
class Phone {
    private int number;
    private String model;
    private double weight;

    public Phone() throws IncorrectNumber, IncorrectWeight {
        this.setNumber(0);
        this.setModel("null");
        this.setWeight(0);
    }

    public Phone(int number, String model) throws IncorrectNumber {
        this.setNumber(number);
        this.setModel(model);
    }

    public Phone(int number, String model, double weight) throws IncorrectNumber, IncorrectWeight {
        this(number, model);
        this.setWeight(weight);
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) throws IncorrectNumber {
        if (number < 0) {
            throw new IncorrectNumber();
        }
        this.number = number;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) throws IncorrectWeight {
        if (weight < 0 || weight > 1000) {
            throw new IncorrectWeight();
        }
        this.weight = weight;
    }

    public void receiveCall(String name) {
        System.out.println(name + " is calling");
    }

    public void receiveCall(String name, int number) {
        System.out.println(name + " " + number + " is calling");
    }

    public void sendMessage(int... numbers) {
        for (int n : numbers) {
            System.out.println("The message will be sent to the numbers " + n + "\t");
        }
    }
}


