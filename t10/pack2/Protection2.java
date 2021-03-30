package oop.tasks.t10.pack2;

import oop.tasks.t10.pack1.Protection;

public class Protection2 extends Protection {
    Protection2() {
        System.out.println(" онструктор, унаследованный из другого пакета");

//        ƒоступно только дл€ данного класса или пакета
//        System.out.println("n = " + p.n);

//        ƒоступно только тому же классу
//        System.out.println("n_pri = " + n_pri);

        System.out.println("n_pro = " + n_pro);
        System.out.println("n_pub = " + n_pub);
    }
}
