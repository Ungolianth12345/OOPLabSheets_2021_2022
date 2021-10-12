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
        int total = 0;#
        // Fix
        for (int i = 0; i < departments.length; i++) {
            for (int j = 0; j < getDepartments(); j++) {
                total += j;
            }
        }
    }

    public String toString() {
        return "Institute Name: " + getName() + "\nDepartments: " + getDepartments();
    }
}
