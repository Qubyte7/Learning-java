package exerci1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

class Student{
    int Age;
    String StudentFname;
    public Student(String fname,Integer age){
        this.Age = age;
        this.StudentFname =fname;
    }
    @Override
    public String toString(){
        return StudentFname + " " + Age;
    }
}


class CompareByage implements Comparator<Student>{
    @Override
    public int compare(Student c1,Student c2){
        return c1.Age - c2.Age;
    }
}
public class Comaparator {
    static public void main(String[]args){
        ArrayList<Student> c= new ArrayList<>();
        Collections.addAll(c,new Student("Gisele",16),
                             new Student("Elysa",17)
        );
        Collections.sort(c,new CompareByage());
        System.out.println(c);
    }
}
