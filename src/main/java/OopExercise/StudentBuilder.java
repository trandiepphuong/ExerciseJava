package OopExercise;

public class StudentBuilder {
    private int id;
    private String firstName;
    private String lastName;
    private String birthday;
    private String className;
    private String address;

    public int getId() {
        return id;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getBirthday() {
        return birthday;
    }

    public String getClassName() {
        return className;
    }

    public String getAddress() {
        return address;
    }

    public StudentBuilder() {
    }


    public StudentBuilder setId(int id) {
        this.id = id;
        return this;
    }

    public StudentBuilder setFirstName(String firstName) {
        this.firstName = firstName;
        return this;
    }


    public StudentBuilder setLastName(String lastName) {
        this.lastName = lastName;
        return this;
    }


    public StudentBuilder setBirthday(String birthday) {
        this.birthday = birthday;
        return this;
    }


    public StudentBuilder setClassName(String className) {
        this.className = className;
        return this;
    }


    public StudentBuilder setAddress(String address) {
        this.address = address;
        return this;
    }

    public Student build(){
        return new Student(this);
    }
}
