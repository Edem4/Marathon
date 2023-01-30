package day9.Task1;

public class Task1 {
    public static void main(String[] args) {
        Student edem = new Student("Эдем","programist");
        Teacher esma = new Teacher("Эсма","Русский язык");
        System.out.println(edem.getGroupName());
        System.out.println(esma.getSubjectName());

        edem.printInfo();
        esma.printInfo();

    }

}
