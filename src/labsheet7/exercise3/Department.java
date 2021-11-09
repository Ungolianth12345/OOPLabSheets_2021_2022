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
        String str = "";

        str += "Name: " + getName() + "\nList of Students:\n\n";

        for (int i = 0; i < getStudents().length; i++) {
            if (getStudents()[i] != null) {
                str += getStudents()[i];
            }
        }

        str += "\n";

        return str;
    }

    public Department(String name, Student[] students) {
        setName(name);
        setStudents(students);
    }
}
