import java.util.HashMap;
public class HAshMAp {
    public static void main(String[] args) {

        HashMap<String, Integer> marks = new HashMap<>();
        
        marks.put("Java", 90);
        marks.put("Python", 85);
        marks.put("C++", 80);
        
        System.out.println(marks.get("Java"));
        
        System.out.println(marks.containsKey("Python"));
        
        marks.remove("C++");
        
        System.out.println(marks.size());
        }
}

