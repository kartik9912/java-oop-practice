import java.util.*;
public class Practice {
    static String result(int mark){
        if(mark<40){
            return "Fail";
        }
        return "Pass";
    }
    public static void main(String[] args){
        ArrayList<String> students = new ArrayList<>();
        students.add("Asha");
        students.add("Ravi");
        students.add("Meera");
        students.add("Rekha");

        HashMap<String,Integer> marks = new HashMap<>();
        marks.put("Asha",91);
        marks.put("Ravi",84);
        marks.put("Meera",95);
        marks.put("Rekha",34);

        for(String name : students){
            int mark = marks.get(name);
            System.out.println(name + ": "+ mark+" - "+ result(mark));
        }
    }
}

