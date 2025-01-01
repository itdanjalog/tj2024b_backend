package day17.step3;

interface X { void x(); }

interface Y { void y(); }

interface MyInterface extends X,Y{
    void myMethod();
}

class MyClass implements MyInterface {
    @Override
    public void x() {
        System.out.println("x()");
    }
    @Override
    public void y() {
        System.out.println("y()");
    }
    @Override
    public void myMethod() {
        System.out.println("myMethod()");
    }
}


public class Step5 {
    public static void main(String[] args) {
        MyClass mClass = new MyClass();

        X xClass =mClass;
        xClass.x();

        Y yClass =mClass;
        yClass.y();

        MyInterface iClass = mClass;
        iClass.myMethod();
        iClass.x();
        iClass.y();
    }
}
