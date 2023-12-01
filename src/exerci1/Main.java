package exerci1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Stack;

public class Main {
    static public void  main(String[]args){
        ArrayList<String> Names  = new ArrayList<>();
        Collections.addAll(Names , "Nicaise","Innocent","Ella","Daniella");
        ArrayList<String> Names2 = new ArrayList<>();
        Collections.addAll(Names2,"Giselle","Nathan","Josue","Bruce");
        Names.set(0,"Nicaise Kirezi");
        Names.add(1,"Zamzam");
        if(Names.contains("Christian") || Names2.contains("Christian")){
            System.out.println(" Christia available");
        }else {
            System.out.println(" Christian Not Found!");
        };
        ArrayList<Object> combinedList = new ArrayList<>();
        Collections.addAll(combinedList,Names,Names2);
        System.out.println(combinedList);
        Stack<String> stack = new Stack<>();
        Collections.addAll(stack,"Giselle","Nathan","Josue","Bruce");
        stack.pop();

        System.out.println(stack);

        System.out.println( stack.peek());//this will return the top level



    }
}
