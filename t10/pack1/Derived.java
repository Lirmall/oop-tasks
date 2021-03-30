package oop.tasks.t10.pack1;

public class Derived extends Protection {
    Derived() {
        System.out.println("Конструктор подкласса в том же пакете");
        System.out.println("n = " + n);

//        Доступно только тому же классу
//        System.out.println("n_pri = " + n_pri);

        System.out.println("n_pro = " + n_pro);
        System.out.println("n_pub = " + n_pub);
    }
}
