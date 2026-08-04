//Common String Methods

//String manipulation includes the most important factors which are as follows:
//String concatenation
//Slicing


public class StringMethods {
    public static void main(String[] args){
        String name="prerana";
        String s1="hello";
        String s2="hello";
        String text=" java ";
        System.out.println(name.length());
        System.out.println(name.charAt(5));
        System.out.println(name.toUpperCase());
        System.out.println(name.toLowerCase());
        System.out.println(name.contains("Java"));
        System.out.println(s1.equals(s2));
        System.out.println(name.replace("Prerana", "Mayuri"));
        System.out.println(name.substring(0,7));
        System.out.println(s1.concat(s2));
        System.out.println(text.trim());
    }
}



