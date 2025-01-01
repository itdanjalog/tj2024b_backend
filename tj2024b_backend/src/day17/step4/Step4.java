package day17.step4;


class Car {
    Tire tire;
    public void run(){  this.tire.roll();    }
}
interface Tire {
    void roll();
}
class HankookTire implements Tire {
    @Override
    public void roll(){
        System.out.println("한국 타이어가 회전합니다.");
    }
}
class KumhoTire implements Tire {
    @Override
    public void roll(){
        System.out.println("금호 타이어가 회전합니다.");
    }
}


public class Step4 {
    public static void main(String[] args) {

        Car myCar = new Car();
        // myCar.run();
        Car yourCar = new Car();
        //yourCar.tire = new Tire();
        //yourCar.run();

        //myCar.tire = new Tire();
        //myCar.run();

        myCar.tire = new HankookTire();
        myCar.run();

        myCar.tire = new KumhoTire();
        myCar.run();
        //yourCar.run();

        System.out.println( myCar.tire instanceof KumhoTire);
        if( myCar.tire instanceof Tire){
            myCar.tire = new HankookTire();
        }
        myCar.run();
    }
}