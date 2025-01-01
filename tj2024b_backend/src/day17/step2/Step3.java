package day17.step2;

public class Step3 {
    public static void main(String[] args) {

        // 객체 생성
        Customer customer = new Customer();
        //  customer타입 이 Buy타입 변환 ( 자동 타입 변환 )
        Buy buyer = customer;
        buyer.buy();
        buyer.order();

        // customer타입 이 Sell타입 변환( 자동 타입 변환 )
        Sell seller = customer;
        seller.sell();
        seller.order();

        if( seller instanceof Customer ){   // seller 타입이 Customer 타입에 포함되었는지
            Customer customer2 = (Customer) seller;
            customer2.buy();
            customer2.sell();
        }

        Buy.pay();
        Sell.pay();

        customer.order();


    }
}
