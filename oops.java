 //write a java code to display the name of the student,the age of the student and its roll no using class and object   

 class Student {

    String name;
    int age;
    
    void display() {
    System.out.println(name + " " + age);
    }
    }
    
    public class oops {
    
    public static void main(String[] args) {
    
    Student s1 = new Student();
    Student s2 = new Student();
    
    s1.name = "Rahul";
    s1.age = 20;
    
    s2.name = "Priya";
    s2.age = 22;
    
    s1.display();
    s2.display();
    }
    }
