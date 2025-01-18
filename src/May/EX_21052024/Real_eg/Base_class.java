package May.EX_21052024.Real_eg;

abstract public class Base_class {
    //real eg . web automation
    //single inhertience - parent - child
    //Hierirchical inheritance - parent - child 1
    //                                  - child 2
    abstract String openbrowser();//who will compete this ?
    abstract String cloasenbrowser();//whoever extends..

    void printlog(){
        System.out.println("print log");
    }
}
