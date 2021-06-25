package OopExerciseTest;

import OopExercise.Student;
import OopExercise.StudentBuilder;
import OopExercise.StudentController;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class StudentTest {
    static Student s1 = new StudentBuilder()
            .setId(1)
            .setFirstName("Phuong")
            .setLastName("Tran")
            .setBirthday("15/03/2000")
            .setClassName("IT")
            .setAddress("Da Nang")
            .build();
    static Student s2 = new StudentBuilder()
            .setId(2)
            .setFirstName("Triet")
            .setLastName("Tran")
            .setBirthday("15/03/2000")
            .setClassName("IT2")
            .setAddress("Tam Ky")
            .build();
    static Student s3 = new StudentBuilder()
            .setId(3)
            .setFirstName("Linh")
            .setLastName("Nguyen")
            .setBirthday("15/03/2000")
            .setClassName("IT3")
            .setAddress("Phu Yen")
            .build();

    public static List<Student> studentList = new ArrayList<>();
    public static final StudentController studentController = new StudentController();

    @BeforeAll
    static void initAll() throws IOException {
        studentList.add(s1);
        studentList.add(s2);
        studentList.add(s3);
        studentController.setStudents(studentList);
    }

    @Test
    void test_addStudent() {
        studentController.addStudent(new StudentBuilder()
                .setId(4)
                .setFirstName("Ronaldo")
                .setLastName("Cristiano")
                .setBirthday("05/02/1985")
                .setClassName("Juventus")
                .setAddress("Portugal")
                .build());
    }

    @Test
    void test_delete() {
        studentController.deleteStudent(s3);
    }

    @Test
    void test_saveToFile() throws IOException {
        studentController.saveToFile("src/main/java/OopExercise/students.json");
    }

    @Test
    void test_loadFromFile() throws IOException {
        studentController.loadFromFile("src/main/java/OopExercise/students.json");

    }

    @Test
    void test_getById() {
        assertEquals(studentController.getById(1).getFirstName(), s1.getFirstName());
        assertEquals(studentController.getById(10), null);
    }

    @Test
    void test_findByName() {
        assertEquals(studentController.findByName("Triet").getFirstName(), s2.getFirstName());
        assertEquals(studentController.findByName("Messi"), null);
    }

    @Test
    void test_findByClassName() {
        assertEquals(studentController.findByClassName("IT3").getFirstName(), s3.getFirstName());
        assertEquals(studentController.findByClassName("IT4"), null);
    }
}
