package OopExercise;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.reflect.TypeToken;

import java.io.*;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.List;

public class StudentController {
    public static final Gson gson = new Gson();

    public void addStudent(List<Student> dataStudent, Student student) {
        dataStudent.add(student);
    }

    public void deleteStudent(List<Student> dataStudent, Student student) {
        dataStudent.remove(student);
    }

    public void saveToFile(String path, List<Student> dataStudent) throws IOException {
        Gson gson = new GsonBuilder().setPrettyPrinting().create();
        FileWriter f = new FileWriter(new File(path));
        f.write(gson.toJson(dataStudent));
        f.flush();
    }

    public static List<Student> loadFromFile(String path) throws IOException {
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

    public Student getById(List<Student> dataStudent, int id) {
        for (Student student : dataStudent) {
            if (student.getId() == id) {
                return student;
            }
        }
        return null;
    }

    public Student findByName(List<Student> dataStudent, String name) {
        for (Student student : dataStudent) {
            if (student.getFirstName().equals(name)) {
                return student;
            }
        }
        return null;
    }

    public Student findByClassName(List<Student> dataStudent, String className) {
        for (Student student : dataStudent) {
            if (student.getClassName().equals(className)) {
                return student;
            }
        }
        return null;
    }
}