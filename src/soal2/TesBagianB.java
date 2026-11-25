package soal2;

class A {
    A() {
        System.out.println("A dibuat");
        init();
    }

    void init() {
        System.out.println("init A");
    }
}

class B extends A {
    int nilai = 5;

    B() {
        super();
        System.out.println("B dibuat, nilai=" + nilai);
    }

    @Override
    void init() {
        System.out.println("init B, nilai=" + nilai);
    }
}

public class TesBagianB {
    public static void main(String[] args) {
        new B();
    }
}