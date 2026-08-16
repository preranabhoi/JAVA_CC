/*
LEVEL-4
HAsh map + frequency
NOTE- If something repeats use hash map to store the frequency
Q.find the first non-repeating character "aabbcdde" ====>c 
*/
import java.util.HashMap;

public class HAshMAp4 {
    public static void main(String[] args) {
        String str = "aabbcdde";
 
        HashMap<Character, Integer> freqMap = new HashMap<>();
        
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
       
            freqMap.put(ch, freqMap.getOrDefault(ch, 0) + 1);
        }
        
        char result = ' '; 
        boolean found = false;
        
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if (freqMap.get(ch) == 1) {
                result=ch;
                found = true;
                break;  
            }
        }
        
        if (found) {
            System.out.println("First non-repeating character: " + result);
        } else {
            System.out.println("No non-repeating character found");
        }
    }
}
