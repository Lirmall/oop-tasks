package oop.tasks.t1.phone.tasks;

//по вот этой ссылке, первое задание https://www.examclouds.com/ru/java/java-core-russian/lesson7-tasks
 class Phone {
    private int number;
    private String model;
    private double weight;

    public Phone() {
        this.number = 0;
        this.model = "null";
        this.weight = 0;
    }

    public Phone(int number, String model) {
        this.number = number;
        this.model = model;
    }

    public Phone(int number, String model, double weight) {
        this(number, model);
        this.weight = weight;
    }

    public int getNumber() {
        return this.number;
    }

    public String getModel() {
        return this.model;
    }

    public double getWeight() {
        return this.weight;
    }

    public void receiveCall(String name) {
        System.out.println("Звонит " + name);
    }

    public void receiveCall(String name, int number) {
        System.out.println("Звонит " + name + " " + number);
    }

    public void sendMessage(int... numbers) {
        for (int n : numbers) {
            System.out.println("Сообщение будет отправлено на номер " + n + "\t");
        }
    }
}


