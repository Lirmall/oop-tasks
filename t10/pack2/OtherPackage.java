package oop.tasks.t10.pack2;

import oop.tasks.t10.pack1.Protection;

public class OtherPackage {
    OtherPackage() {
        oop.tasks.t10.pack1.Protection p = new oop.tasks.t10.pack1.Protection();
        System.out.println("����������� �� ������� ������");

//        �������� ������ ��� ������� ������ ��� ������
//        System.out.println("n = " + p.n);

//        �������� ������ ���� �� ������
//        System.out.println("n_pri = " + n_pri);

//        �������� ������ ��� ������� ������, ��������� ��� ������
//        System.out.println("n_pro = " + p.n_pro);

        System.out.println("n_pub = " + p.n_pub);
    }
}
