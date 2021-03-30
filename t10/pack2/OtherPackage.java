package oop.tasks.t10.pack2;

import oop.tasks.t10.pack1.Protection;

public class OtherPackage {
    OtherPackage() {
        oop.tasks.t10.pack1.Protection p = new oop.tasks.t10.pack1.Protection();
        System.out.println(" онструктор из другого пакета");

//        ƒоступно только дл€ данного класса или пакета
//        System.out.println("n = " + p.n);

//        ƒоступно только тому же классу
//        System.out.println("n_pri = " + n_pri);

//        ƒоступно только дл€ данного класса, подкласса или пакета
//        System.out.println("n_pro = " + p.n_pro);

        System.out.println("n_pub = " + p.n_pub);
    }
}
