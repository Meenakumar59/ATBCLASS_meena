package May.EX_16052024_inheritance;

public class java extends programmig {
    //single inheritance - A
    //Java A progrnammig language
    //Python A programming language
 String newfeature;
//    int version;
//    String feature; -- Attribute and behaviour present in child class
    public java() {
        System.out.println("DC");;
    }

    public java(String newfeature) {
        this.newfeature = newfeature;
    }
    void printInfo(){
        System.out.println("program info-->"+this.version+ "pro featur--->" + this.feature);//methods - created within the class
        bhk();// function also present in child class
    }
}
