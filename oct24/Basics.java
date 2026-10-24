import java.util.Arrays;
import java.util.HashMap;
public class Basics {

    static int smallest(int[] arr){
        if(arr.length==0){
            throw new IllegalArgumentException("Array cannot be empty");
        }
        int min = Integer.MAX_VALUE;
        for(int i=0;i<arr.length;i++){
            if(arr[i]<min){
                min=arr[i];
            }
        }
        return min;
    }

    static HashMap<Character,Integer> countFreq(String str){
        HashMap<Character,Integer> freq = new HashMap<>();
        for(int i=0;i<str.length();i++){
            char ch = str.charAt(i);
            freq.put(ch,freq.getOrDefault(ch,0)+1);
        }
        return freq;
    }

    static boolean isEven(int n){
        return n%2==0;
    }
    public static void main(String[] args){
        int[] marks = {23,45,63,12,42};
        System.out.println(Arrays.toString(marks));
        System.out.println("Smallest element in Array -> "+smallest(marks));

        String str = "chitkara";
        System.out.println(str);
        System.out.println("Character frequencies: " + countFreq(str));

        for (int mark : marks) {
        String type = isEven(mark) ? "even" : "odd";
        System.out.println(mark + " -> " + type);
}



    }
}
