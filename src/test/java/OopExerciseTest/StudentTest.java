package OopExerciseTest;

import OopExercise.Student;
import OopExercise.StudentBuilder;
import OopExercise.StudentController;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

import static org.junit.jupiter.api.Assertions.*;

public class StudentTest {
    static Student s1 = new StudentBuilder()
            .setId(1)
            .setFirstName("Phuong")
            .setLastName("Tran")
            .setBirthday("15/03/2000")
            .setClassName("IT")
            .setAddress("Da Nang")
            .build();
    public static List<Student> studentList = new ArrayList<>();
    public static final StudentController studentController = new StudentController();

    @BeforeAll
    static void initAll() throws IOException {
        studentList.add(s1);
        studentController.setStudents(studentList);
    }

    @Test
    void test_addStudent() {
        Student s2 = new StudentBuilder()
                .setId(2)
                .setFirstName("Ronaldo")
                .setLastName("Cristiano")
                .setBirthday("05/02/1985")
                .setClassName("Juventus")
                .setAddress("Portugal")
                .build();
        studentController.addStudent(s2);
        assertEquals(studentController.getById(2), s2);
    }

    @Test
    void test_saveToFile() throws IOException {
        Gson gson = new GsonBuilder().setPrettyPrinting().create();
        studentController.saveToFile("src/main/java/OopExercise/students.json");
        String jsonStr = new Scanner(new FileReader("src/main/java/OopExercise/students.json")).useDelimiter("\\Z").next();
        assertEquals(gson.toJson(studentController.getStudents()), jsonStr);
    }

    @Test
    void test_loadFromFile() throws IOException {
        studentController.saveToFile("src/main/java/OopExercise/students.json");
        List<Student> beforeLoad = studentController.getStudents();
        studentController.loadFromFile("src/main/java/OopExercise/students.json");
        assertTrue(beforeLoad.size()==studentController.getStudents().size());
    }

    @Test
    void test_getById() {
        assertEquals(studentController.getById(1).getFirstName(), s1.getFirstName());
        assertEquals(studentController.getById(10), null);
    }

    @Test
    void test_findByName() {
        assertEquals(studentController.findByName("Phuong").getFirstName(), s1.getFirstName());
        assertEquals(studentController.findByName("Messi"), null);
    }

    @Test
    void test_findByClassName() {
        assertEquals(studentController.findByClassName("IT").getFirstName(), s1.getFirstName());
        assertEquals(studentController.findByClassName("IT4"), null);
    }

    @Test
    void test_delete() {
        Student s3 = new StudentBuilder()
                .setId(3)
                .setFirstName("ID3")
                .setLastName("ID3")
                .setBirthday("15/03/2000")
                .setClassName("IT")
                .setAddress("Da Nang")
                .build();
        studentController.addStudent(s3);
        assertEquals(studentController.getById(3).getFirstName(), "ID3");
        studentController.deleteStudent(studentController.getById(3));
        assertEquals(studentController.getById(3), null);
    }
}
