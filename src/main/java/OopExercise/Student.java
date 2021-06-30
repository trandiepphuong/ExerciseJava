package OopExercise;

import java.util.ArrayList;
import java.util.List;

public class Student {
    private int id;
    private String firstName;
    private String lastName;
    private String birthday;
    private String className;
    private String address;

    public Student(StudentBuilder studentBuilder) {
        this.id = studentBuilder.getId();
        this.firstName = studentBuilder.getFirstName();
        this.lastName = studentBuilder.getLastName();
        this.birthday = studentBuilder.getBirthday();
        this.className = studentBuilder.getClassName();
        this.address = studentBuilder.getAddress();
    }
    
    public int getId() {
        return id;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getClassName() {
        return className;
    }
}




