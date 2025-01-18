package May.EX_21052024;

public abstract class Car {//means this class is incomplete, will be complete in future
    public Car(){
        System.out.println("Car!!!");
    }
    void breaksys(){
        System.out.println("apply break");
    }
    abstract void drive();//abstarct class cannot have body
    //if method is abstarct then class also should abstarct.
    //non concrete class


}
