package exerci1;

import java.util.HashMap;
import java.util.Map;

class Pupil{
    int age;
    public Pupil(int age){
        this.age=age;
    }
}
public class MapRe {
    public static void  main(String[]args){
        Pupil s1 =new Pupil(1);
        Pupil s2 = new Pupil(1);
        Map<Pupil,String> mapp = new HashMap<>();
        mapp.put(s1,"student 1");
        mapp.put(s2,"student 1");
        System.out.println(mapp.size());
        Integer a=1;
        Integer b=1;
        Map<Integer,String> mapp2= new HashMap<>();
        mapp2.put(a,"value 1");
        mapp2.put(b,"value1");
        System.out.println(mapp2.size());

    }
}
