package May.EX_18052024;

class Lab_133_e {
    public static void main(String[] args) {
        student s1 = new student();
//        s1.message();
        s1.display();

    }

}
class student extends person{
    void message(){
        System.out.println("I am student message");
    }
    void display(){
        this.message();
        super.message();
        super.message1();
    }
}
class person {
    void message(){
        System.out.println("I am person message");
    }
    void message1(){
        System.out.println("I am person message1");
    }
}