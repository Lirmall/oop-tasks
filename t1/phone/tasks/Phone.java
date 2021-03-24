package oop.tasks.t1.phone.tasks;

// �������� ����� Phone, ������� �������� ���������� number, model � weight.
//�� ��� ���� ������, ������ ������� https://www.examclouds.com/ru/java/java-core-russian/lesson7-tasks
 class Phone {
    protected int number;
    protected String model;
    protected double weight;

    //�������� ����������� � ����� Phone, ������� ��������� �� ����
    // ��� ��������� ��� ������������� ���������� ������ - number, model � weight.
    //������� �� ������������ � ����� ����������� ����������� � �����.
    protected Phone(int number, String model, double weight) {
        this(number, model);
        this.weight = weight;
    }

    /* �������� � ����� Phone ������: receiveCall, ����� ���� �������� � ��� ���������. ������� �� ������� ��������� ������� {name}�.
     * getNumber � ���������� ����� ��������.
     * ������� ��� ������ ��� ������� �� ��������.
     */
    protected void receiveCall(String name) {
        System.out.println("������ " + name);
    }

    protected int getNumber() {
        return number;
    }

    //�������� �����������, ������� ��������� �� ���� ��� ��������� ��� ������������� ���������� ������ - number, model.
    protected Phone(int n, String m) {
        this.number = n;
        this.model = m;
    }

    //�������� ����������� ��� ����������.
    protected Phone() {
        this.number = 0;
        this.model = "null";
        this.weight = 0;
    }

    //�������� ������������� ����� receiveCall, ������� ��������� ��� ��������� -
    // ��� ��������� � ����� �������� ���������. ������� ���� �����.
    protected void receiveCall(String name, int number) {
        System.out.println("������ " + name + " " + number);
    }

    //������� ����� sendMessage � ����������� ���������� �����.
    // ������ ����� ��������� �� ���� ������ ���������, ������� ����� ���������� ���������.
    // ����� ������� �� ������� ������ ���� ���������.

    protected void sendMessage(int... i) {
        for (int n : i) {
            System.out.println("��������� ����� ���������� �� ����� " + n);
        }
    }
    //�������� ����� Phone � ������������ � ���������� JavaBean.


}


