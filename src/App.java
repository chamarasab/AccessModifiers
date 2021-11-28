import abstracts.Person;
import inherited.*;
public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");

        Student student = new Student();
        student.setname("Chamara", "Ekanayake");

        student.getName();
    }
}
