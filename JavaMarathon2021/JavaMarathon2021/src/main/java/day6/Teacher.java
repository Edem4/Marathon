package day6;

import javax.crypto.spec.PSource;
import javax.xml.crypto.dsig.keyinfo.KeyValue;

public class Teacher {
    private String name;
    private String lessons;

    public Teacher(String name, String lessons) {
        this.name = name;
        this.lessons = lessons;
    }

    public void evaluate(Student s) {
        int num = (int) (Math.random() * 5) + 2;
        String valuation = "";
        switch (num) {
            case 2:
                valuation = "неудовлетворительно";
                break;
            case 3:
                valuation = "удовлетворительно";
                break;
            case 4:
                valuation = "хорошо";
                break;
            case 5:
                valuation = "отлично";
                break;
        }
        System.out.println("Преподователь " + this.name +
                " оценил студента с именем " + s.getName() + " по предмету "
                + this.lessons + " на оценку " + valuation);

    }
}
