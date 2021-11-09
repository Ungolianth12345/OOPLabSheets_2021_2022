package labsheet7.exercise3;

public class Institute {
    private String name;
    private Department[] departments;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Department[] getDepartments() {
        return departments;
    }

    public void setDepartments(Department[] departments) {
        this.departments = departments;
    }

    public int getTotalStudents() {
        int totalStudents = 0;
        Student[] students;

        for (int i = 0; i < getDepartments().length; i++) {
            if (getDepartments()[i] != null) {
                students = getDepartments()[i].getStudents();
                for (int j = 0; j < students.length; j++) {
                    if (students[j] != null) {
                        totalStudents++;
                    }
                }
            }
        }
        return totalStudents;
    }

    public String toString() {
        StringBuilder str = new StringBuilder();

        str.append("Name: ").append(getName()).append("\n\nDepartments:\n");
        for (int i = 0; i < getDepartments().length; i++) {
            if (getDepartments()[i] != null) {
                str.append(getDepartments()[i]);
            }
        }

        return str.toString();
    }

    public Institute(String name, Department[] departments) {
        setName(name);
        setDepartments(departments);
    }
}
