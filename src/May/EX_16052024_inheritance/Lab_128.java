package May.EX_16052024_inheritance;

public class Lab_128 {

    //inheritance- inherits attribute an behaviour from parent and grandparent
    // superclass\parent class\base class
    //sub class\child class\ derived class
    // usual word - parent classs and child class
    //child can externds fro parent
    //Extend keyword - parent atribute availbale to the child
//    String feature;
//    int version;
//
//    public Lab_128() {
//        System.out.println("DC");
//    }
//
//    public Lab_128(String feature) {
//        this.feature = feature;
//
//    }
    public static void main(String[] args) {
        programmig p = new programmig(12,"XX");
        java j = new java("lambda");
//        j.newfeature;
        p.printInfo();
        python Python = new python();
//        Python.version;
        Python.bhk();
//        Python.feature;
    }

}
