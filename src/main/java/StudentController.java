import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;

import java.io.*;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.List;

public class StudentController {
    //data
    public List<Student> dataStudent = new ArrayList<Student>();
    public void addStudent(Student student) {
        dataStudent.add(student);
    }
    public void deleteStudent(Student student){
        dataStudent.remove(student);
    }
    public void saveToFile(String path) throws IOException {
        Gson gson = new Gson();
        FileWriter f = new FileWriter(new File(path,"students.json"));
        f.write(gson.toJson(dataStudent));
        f.flush();
    }
    public void loadFromFile(String path) throws IOException {
        Gson gson = new Gson();
        StringBuilder jsonStr = new StringBuilder();
        FileReader f = new FileReader(new File("C:\\Users\\DELL\\Desktop", "students.json"));
        BufferedReader reader = new BufferedReader(f);
        String line = reader.readLine();
        while (line != null) {
            jsonStr.append(line);
            line = reader.readLine();
        }
        Type studentType = new TypeToken<Student>(){}.getType();
        List<Student> dataStudent = gson.fromJson(jsonStr, studentType);
    }
    public Student getById(int id){
        for (Student student : dataStudent){
            if(student.getId()==id){
                return student;
            }
        }
        return null;
    }
    public Student findByName(String name){
        for (Student student : dataStudent){
            if(student.getFirstName().equals(name)){
                return student;
            }
        }
        return null;
    }
    public Student findByClassName(String className){
        for (Student student : dataStudent){
            if(student.getClassName().equals(className)){
                return student;
            }
        }
        return null;
    }
}