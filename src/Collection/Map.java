package Collection;

import java.util.HashMap;

public class Map {
    public static void main(String[]args){
        HashMap<String,Integer> javacourse= new HashMap<>();
        javacourse.put("Zamzam",90);
        javacourse.put("Christian",85);
        javacourse.put("eLLA",85);
        javacourse.put("Kimenyi",49);
        System.out.println(javacourse.get("Christian"));
        javacourse.put("Zamzam",75);
        System.out.println(javacourse.get("Zamzam"));
        System.out.println(javacourse);
    }
}
