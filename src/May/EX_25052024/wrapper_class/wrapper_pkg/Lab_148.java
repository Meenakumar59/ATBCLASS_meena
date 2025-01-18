package May.EX_25052024.wrapper_class.wrapper_pkg;

public class Lab_148 {

}
class Student{
    String name;
    Integer rollno;
    Long Phonenumber;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getRollno() {
        return rollno;
    }

    public void setRollno(Integer rollno) {
        this.rollno = rollno;
    }

    public Long getPhonenumber() {
        return Phonenumber;
    }

    public void setPhonenumber(Long phonenumber) {
        this.Phonenumber = phonenumber;
    }

    public Student(String name, Integer rollno, Long phonenumber) {
        this.name = name;
        this.rollno = rollno;
        Phonenumber = phonenumber;
    }
}
