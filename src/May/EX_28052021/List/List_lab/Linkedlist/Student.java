package May.EX_28052021.List.List_lab.Linkedlist;

import java.util.Comparator;

class sortByIdAs implements Comparator<Student> {
    @Override
    public int compare(Student o1, Student o2) {
        return Integer.compare(o1.getId(), o2.getId());
    }
}
class sortByIdDec implements Comparator<Student> {
    @Override
    public int compare(Student o1, Student o2) {
        return Integer.compare(o2.getId(), o1.getId());
    }
}
class sortByNameAsc implements Comparator<Student> {
    @Override
    public int compare(Student o1, Student o2) {
        return o1.getName().compareTo(o2.getName());
    }
}
class sortByNameDec implements Comparator<Student> {
    @Override
    public int compare(Student o1, Student o2) {
        return o2.getName().compareTo(o1.getName());
    }
}

public class Student implements Comparable<Student> {
    String name;
    Integer id;

    public Student(String name, Integer id) {
        this.name = name;
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    @Override
    //toString - It is a amethod which is present in the object class
    //it print all your data variables
    //also used to anything convert ot string
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", id=" + id +
                '}';
    }

//    @Override
//    public int compareTo(Student o) {
//        return Integer.compare(this.id, o.id);
//    }
    @Override
    public int compareTo(Student o) {
        return CharSequence.compare(this.name, o.name);
    }
    //comparable - compare within itself (same data type)
    //onle one  method - compareTo() - responsible for sorting elemnts
    //if integer - integer.compare()
    //if string - charSequence().compare();
    //-------------------------------------------
    //comparator - have choice compare with diff data types, can add multiple class
    //two methods - compare() and equals()
    //if integer -Integer.compare
    //if string -o1.getName().compareTo(o2.getName())
}
