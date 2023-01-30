package day6;

public class Task3 {
    public static void main(String[] args) {
        Teacher esma = new Teacher("Эсма Фикретовна","русский язык");
        Student student = new Student("Эдем");

        esma.evaluate(student);
    }
}
