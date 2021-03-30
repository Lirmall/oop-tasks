package oop.tasks.t10.pack1;

public class SamePackage {
    SamePackage() {
        Protection p = new Protection();
        System.out.println("Конструктор того же пакета");
        System.out.println("n = " + p.n);

//        Доступно только тому же классу
//        System.out.println("n_pri = " + n_pri);

        System.out.println("n_pro = " + p.n_pro);
        System.out.println("n_pub = " + p.n_pub);
    }
}
