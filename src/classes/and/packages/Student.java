package classes.and.packages;

public class Student {
    public int id;
    public String name;
    public String email;

    //convert the object to string form
    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", email='" + email + '\'' +
                ", dob='" + dob + '\'' +
                ", grade='" + grade + '\'' +
                '}';
    }

    public Student() {
    }

    public Student(int id, String name, String email, String dob, String grade) {
        this.id = id;
        this.name = name;
        this.email = email;
        this.dob = dob;
        this.grade = grade;
    }

    public String dob;
    public String grade;

}
