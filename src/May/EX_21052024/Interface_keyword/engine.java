package May.EX_21052024.Interface_keyword;

public interface engine extends Brake {
    void stopengine();
  //  void startengine();
    void startingthenegine();

    default void haltingengine(){
        System.out.println("halting engine");

    }
//    void m1(){
//
//    }
}
