package OopExerciseTest;

import OopExercise.Student;
import OopExercise.StudentBuilder;
import OopExercise.StudentController;
import org.junit.jupiter.api.Test;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class StudentTest {
    @Test
    public void test_student() throws IOException {
        Student s1 =new StudentBuilder().setId(1).setFirstName("Phuong")
                .setLastName("Tran").setBirthday("15/03/2000").setClassName("IT")
                .setAddress("Da Nang").build();
        Student s2 = new StudentBuilder().setId(1).setFirstName("Triet")
                .setLastName("Tran").setBirthday("15/03/2000").setClassName("IT")
                .setAddress("Tam Ky").build();
        Student s3 = new StudentBuilder().setId(1).setFirstName("Linh")
                .setLastName("Nguyen").setBirthday("15/03/2000").setClassName("IT")
                .setAddress("Phu Yen").build();
        StudentController studentController = new StudentController();
        List<Student> studentList = new ArrayList<>();
        studentList.add(s1);
        studentList.add(s2);
        studentList.add(s3);
        studentController.setStudents(studentList);
        studentController.addStudent(new StudentBuilder().setId(4).setFirstName("Ronaldo")
                .setLastName("Cristiano").setBirthday("05/02/1985").setClassName("Juventus")
                .setAddress("Portugal").build());
        studentController.deleteStudent(s3);
        studentController.saveToFile("C:\\Users\\DELL\\Desktop\\students.json");
        studentController.loadFromFile("C:\\Users\\DELL\\Desktop\\students.json");
        assertEquals(studentController.getById(1).toString(),"Phuong");
        assertEquals(studentController.getById(10),null);
        assertEquals(studentController.findByName("Triet").toString(),"Triet");
        assertEquals(studentController.findByName("Linh"),null);
        assertEquals(studentController.findByClassName("Juventus").toString(),"Ronaldo");
        assertEquals(studentController.findByClassName("tempClass"),null);
    }
}
