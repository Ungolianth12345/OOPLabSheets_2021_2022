package labsheet7.exercise3;

public class Department {
    private String name;
    private Student[] students;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Student[] getStudents() {
        return students;
    }

    public void setStudents(Student[] students) {
        this.students = students;
    }

    public String toString() {
        return "Department Name: " + getName() + "\nStudents: " + getStudents();
    }

    public Department (String name, Student[] students) {
        setName(name);
        setStudents(students);
    }
}
