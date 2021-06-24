package OopExercise;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.reflect.TypeToken;

import java.io.*;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.List;

public class StudentController {
    private List<Student> students = new ArrayList<>();

    public static final Gson gson = new Gson();

    public StudentController() {
    }


    public void addStudent(Student student) {
        getStudents().add(student);
    }

    public List<Student> getStudents() {
        return students;
    }

    public void setStudents(List<Student> students) {
        this.students = students;
    }

    public void deleteStudent(Student student) {
        getStudents().remove(student);
    }

    public void saveToFile(String path) throws IOException {
        Gson gson = new GsonBuilder().setPrettyPrinting().create();
        FileWriter f = new FileWriter(new File(path));
        f.write(gson.toJson(getStudents()));
        f.flush();
    }

    public List<Student> loadFromFile(String path) throws IOException {
        StringBuilder jsonStr = new StringBuilder();
        FileReader f = new FileReader(new File(path));
        BufferedReader reader = new BufferedReader(f);
        String line = reader.readLine();
        while (line != null) {
            jsonStr.append(line);
            line = reader.readLine();
        }

        Type listOfMyClassObject = new TypeToken<ArrayList<Student>>() {
        }.getType();
        List<Student> outputList = gson.fromJson(jsonStr.toString(), listOfMyClassObject);
        return outputList;
    }

    public Student getById(int id) {
        for (Student student : getStudents()) {
            if (student.getId() == id) {
                return student;
            }
        }
        return null;
    }

    public Student findByName(String name) {
        for (Student student : getStudents()) {
            if (student.getFirstName().equals(name)) {
                return student;
            }
        }
        return null;
    }

    public Student findByClassName(String className) {
        for (Student student : getStudents()) {
            if (student.getClassName().equals(className)) {
                return student;
            }
        }
        return null;
    }
}