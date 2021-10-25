package OopExercise;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.reflect.TypeToken;

import java.io.*;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class StudentController {
    private List<Student> students = new ArrayList<>();

    public List<Student> getStudents() {
        return students;
    }

    public static final Gson gson = new Gson();

    public void addStudent(Student student) {
        students.add(student);
    }

    public void setStudents(List<Student> students) {
        this.students = students;
    }

    public void deleteStudent(Student student) {
        students.remove(student);
    }

    public void saveToFile(String path) throws IOException {
        Gson gson = new GsonBuilder().setPrettyPrinting().create();
        FileWriter fileWriter = new FileWriter(path);
        fileWriter.write(gson.toJson(students));
        fileWriter.flush();
    }

    public void loadFromFile(String path) throws IOException {
        String jsonStr = new Scanner(new FileReader(new File(path))).useDelimiter("\\Z").next();
        Type listOfMyClassObject = new TypeToken<ArrayList<Student>>() {
        }.getType();
        students = gson.fromJson(jsonStr, listOfMyClassObject);
    }

    public Student getById(int id) {
        for (Student student : students) {
            if (student.getId() == id) {
                return student;
            }
        }
        return null;
    }

    public Student findByName(String name) {
        for (Student student : students) {
            if (student.getFirstName().equals(name)) {
                return student;
            }
        }
        return null;
    }

    public Student findByClassName(String className) {
        for (Student student : students) {
            if (student.getClassName().equals(className)) {
                return student;
            }
        }
        return null;
    }
}