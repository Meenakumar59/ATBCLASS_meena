package May.EX_16052024_inheritance;

public class programmig {
    int version;
    String feature;//instance variable

    public programmig() {
        System.out.println("DC");//dc
    }

    public programmig(int version, String feature) {
        this.version = version;
        this.feature = feature;//pc
    }

    void printInfo() {
        System.out.println("version info-->"+this.version+ "pro featur--->" + this.feature);//methods - created within the class

    }
    void bhk(){
        System.out.println("bhk");
    }

}
