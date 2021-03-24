package oop.tasks.t1.phone.tasks;

// Создайте класс Phone, который содержит переменные number, model и weight.
//по вот этой ссылке, первое задание https://www.examclouds.com/ru/java/java-core-russian/lesson7-tasks
 class Phone {
    protected int number;
    protected String model;
    protected double weight;

    //Добавить конструктор в класс Phone, который принимает на вход
    // три параметра для инициализации переменных класса - number, model и weight.
    //Вызвать из конструктора с тремя параметрами конструктор с двумя.
    protected Phone(int number, String model, double weight) {
        this(number, model);
        this.weight = weight;
    }

    /* Добавить в класс Phone методы: receiveCall, имеет один параметр – имя звонящего. Выводит на консоль сообщение “Звонит {name}”.
     * getNumber – возвращает номер телефона.
     * Вызвать эти методы для каждого из объектов.
     */
    protected void receiveCall(String name) {
        System.out.println("Звонит " + name);
    }

    protected int getNumber() {
        return number;
    }

    //Добавить конструктор, который принимает на вход два параметра для инициализации переменных класса - number, model.
    protected Phone(int n, String m) {
        this.number = n;
        this.model = m;
    }

    //Добавить конструктор без параметров.
    protected Phone() {
        this.number = 0;
        this.model = "null";
        this.weight = 0;
    }

    //Добавьте перегруженный метод receiveCall, который принимает два параметра -
    // имя звонящего и номер телефона звонящего. Вызвать этот метод.
    protected void receiveCall(String name, int number) {
        System.out.println("Звонит " + name + " " + number);
    }

    //Создать метод sendMessage с аргументами переменной длины.
    // Данный метод принимает на вход номера телефонов, которым будет отправлено сообщение.
    // Метод выводит на консоль номера этих телефонов.

    protected void sendMessage(int... i) {
        for (int n : i) {
            System.out.println("Сообщение будет отправлено на номер " + n);
        }
    }
    //Изменить класс Phone в соответствии с концепцией JavaBean.


}


