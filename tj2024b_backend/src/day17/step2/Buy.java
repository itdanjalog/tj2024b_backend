package day17.step2;

public interface Buy {
    void buy(); // 추상메소드
    static void pay(){}
    default void order(){ System.out.println(" 구매 주문"); }
}
