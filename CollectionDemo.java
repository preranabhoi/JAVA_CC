//perform add(), remove() and contains() operations

import java.util.ArrayList;
import java.util.Collection;

public class CollectionDemo {
    public static void main(String[] args) {
        Collection<String> names = new ArrayList<>();

        names.add("raj");
        names.add("ak");
        names.add("prerana");
        System.out.println("Size: " + names.size());
        names.remove("raj");
        System.out.println("after removing raj names=>: " + names);
        names.contains("prerana");
        System.out.println("new Names: " + names);
        // names.clear("ak");
        // System.out.println("clear : " + names);
        if(names.isEmpty()){
            System.out.println("Collection is empty");
        }
        else{
            System.out.println("Names: " + names);
        }

    }
}
