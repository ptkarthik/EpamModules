package corejava.task4.strings;

import java.util.HashMap;
import java.util.Map;

public class DuplicateCharacters {
    public static void main(String[] args) {
        String name= "Karthikeyan is one of the good programmers";
        String loweredData=name.toLowerCase();
        Map<Character,Integer> map= new HashMap<Character,Integer>();
        int count=1;
        char[] a=loweredData.toCharArray();
        for (Character c:a) {
            if(!map.containsKey(c)){
                map.put(c,count);
            } else {
                map.put(c,map.get(c)+1);
            }
        }
        for(Map.Entry<Character,Integer>s:map.entrySet()) {
            if(s.getValue()>1&&s.getKey()!=' ') {
                System.out.println("The Duplicate Characters are "+s.getKey()+" "
                        +"The duplicate occurences are"+" "+s.getValue());
            }
        }
    }

}
