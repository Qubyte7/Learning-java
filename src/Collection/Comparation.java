package Collection;

import com.sun.jdi.event.StepEvent;
import org.w3c.dom.ls.LSOutput;

import javax.crypto.spec.PSource;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
class Student {
    int rollno;
    String name, address;
    public  Student(int rollno,String name,String address){
        this.rollno = rollno;
        this.name = name;
        this.address = address;
    }
   @Override public String toString(){
        return this.rollno+" "+this.name+" "+this.address+"   \"this is tostring doing this 😁\" \n";
    }
}
class SortbyRollNo implements Comparator<Student>{
 public int compare(Student a,Student b){


     return a.rollno - b.rollno;
     //If a.rollno is less than b.rollno, the result will be negative.
     //If a.rollno is greater than b.rollno, the result will be positive.
     //If a.rollno is equal to b.rollno, the result will be 0.
     //The result of this comparison is used by sorting algorithms (e.g., when using Collections.sort or List.sort) to determine the order of the elements. If the result is negative, it means a should come before b in the sorted order. If the result is positive, it means a should come after b. If the result is 0, it means the objects are considered equal in terms of sorting.
 };
}
class Sortbyname implements Comparator<Student> {

    // Method
    // Sorting in ascending order of name
    public int compare(Student a, Student b)
    {
        return a.name.compareTo(b.name);
    }
}

class College{
    String Name;
    int Age;
    // Parameterized constructor
    public College(String Name, Integer Age) {

        // This keyword refers to current instance itself
        this.Name = Name;
        this.Age = Age;
    }
    public String getName() {
        return Name;
    }
    public void setName(String name) {
        Name = name;
    }
    public int getAge() {
        return Age;
    }
    public void setAge(int age) {
        Age = age;
    }
    @Override public String toString()
    {
        return "Customer{" + "Name=" + Name + ", Age=" + Age + '}' +"\n" ;
    }
}
class MoreFieldComp implements Comparator<College>{
    @Override
    public int compare(College lumini1,College lumini2){
        int nameCompare = lumini1.getName().compareTo(lumini2.getName());
        int ageCompare = lumini1.getAge() - lumini2.getAge();
       return (nameCompare == 0) ? ageCompare : nameCompare;

    };
}

class CompareLast implements Comparator<College>{
   @Override
   public int compare(College c1, College c2){
       int number1 =  c1.getAge() % 10;
       int number2 = c2.getAge() % 10;
       return number1 - number2;
   }


}
class Comparation{
    public static void main(String[]args){
//        ArrayList<Student> ListStudent= new ArrayList<>();
//        ListStudent.add(new Student(21,"innocent","huye"));
//        ListStudent.add(new Student(13,"Sabrina","huye"));
//        ListStudent.add(new Student(12,"Gnanza","huye"));
//        ListStudent.add(new Student(14,"Michael","Huye"));
//        ListStudent.add(new Student(10,"Marc","NYARUGURU"));
//        System.out.println(" Unsorted");
//        System.out.println(ListStudent);
//        System.out.println("\n \n Sorted by name");
//        Collections.sort(ListStudent,new Sortbyname());
//        System.out.println(ListStudent);
//        Collections.sort(ListStudent,new SortbyRollNo());
//        System.out.println("\n \n Sorted by roll no");
//        System.out.println(ListStudent);

        ArrayList<College> Luminious= new ArrayList<>();
        Collections.addAll(Luminious,new College("Innocent",12)
                                    ,new College("Abayo",11)
                                    ,new College("Innocent",9)
                                    ,new College("Batete",32)
                                    ,new College("Zidani",31));

        Collections.sort(Luminious,new CompareLast());

        System.out.println("\n\n");
        System.out.println(Luminious);





    }
}






