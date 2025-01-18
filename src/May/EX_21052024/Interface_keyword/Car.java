package May.EX_21052024.Interface_keyword;

public class Car implements Brake,engine {//mutliple inheritance
    @Override
    public void brakesys() {
        System.out.println("apply brake");

    }

    @Override
    public void brakeparts() {

    }

    @Override
    public void stopengine() {
        System.out.println("stop the engine");

    }

    @Override
    public void startingthenegine() {

    }
}
