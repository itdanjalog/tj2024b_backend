package day17.step1;

// implements : 구현하다.
public class ImplementClass implements StepInterface {
    @Override // 오버라이딩
    public void method1(int a) {
        System.out.println("ImplementClass.method1");
    }

    @Override
    public int method2(String a) {
        System.out.println("ImplementClass.method2");
        return 5;
    }
}
