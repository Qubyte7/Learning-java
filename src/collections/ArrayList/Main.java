package collections.ArrayList;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Objects;

public class Main{
    public static void main(String[]args){
    ArrayList<Object> List= new ArrayList<>();
    List.add(20);
    List.add(25);
    List.add("hello");
    List.add(30);
        Iterator itr =  List.iterator();
        while (itr.hasNext()){
            System.out.println(itr.next());
        }
//        for(Object o:List){
//            System.out.println((Integer)o*2);
//        }
        //generics
        Generic<Integer, String> number= new Generic<>(5," weee we");
        number.display();
        DisplayValue(6,"Innocent");
}
    public  static<T,V> V DisplayValue (T value,V string){
        System.out.println("The value : "+ value);
        return string;
    }
}
