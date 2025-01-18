package May.EX_23052024;

public class Lab_143_nested {
    public static void main(String[] args) {
        Car car = new Car("BMW");
        //how to drive without start the engine
        car.drive();
       //mother class shielded her child class
             //   Engine e = new Car.Engine("power");

        Car.Engine engine = car.new Engine("50000C");
        engine.start();
        car.drive();

    }
}
class Car{
    String make;
//constructor
    public Car(String make) {
        this.make = make;
    }
    //method
    void drive(){
        System.out.println("You can drive");
    }
    class Engine{
        //instance variable
        String hoursepower;

        public Engine(String hoursepower) {
            this.hoursepower = hoursepower;
        }
        void start(){
            System.out.println("start the engine" + make);//make var accessed by inner class
        }
    }
}
