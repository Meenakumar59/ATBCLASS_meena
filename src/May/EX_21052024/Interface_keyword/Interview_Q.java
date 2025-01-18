package May.EX_21052024.Interface_keyword;

public class Interview_Q {
    interface I1{} //NC
    interface  I2{}//NC
    class A{}//C
    class B{}//C
    abstract class C{}//NC
    class Test1 extends A{}
    class Test2 extends B{}
    //class Test2 extends A,B{} - Mutiple inheritance not allowed in class
   // class Test3 implements A,B{}
    class Test4 implements I1,I2{}// Multiple inheritance
    class Test5 extends A implements I1,I2{}//single and multiple so it is hybrid inheritance
   // class Test6 extends A,B implements I1,I2{}//single and multiple so it is hybrid inheritance
    //Not possible extends mutiple
  // class Test7 implements I1 extends A{}//first extend then impliments
   // interface I4 extends A{}// Can interface extend class - no
   // interface I5 implemets A{} // Can interface extend class - no
    interface I6 extends I1,I2 {}//can interface extend interface ? yes
   // interface I7 extends C{}//Can interface extends abstract? No






}
