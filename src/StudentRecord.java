public class StudentRecord {

    private String studentId1;
    private String firstName1;
    private String lastName1;
    private int age1;
    private String major1;




    public StudentRecord() {
        studentId1 = "";
        firstName1 = "";
        lastName1 = "";
        age1 = 0;
        major1 = "";
    }



    public record PersonRecord(String StudentId1, String firstName1,  String lastName1, int age1, String major1) {// MORE FIELDS ) {
        this.studentId1 = studentId1;
        this.firstName1 = firstName1;
        this.lastName1 = lastName1;
        this.age1 = age1;
        this.major1 = major1;
    }

    public String getStudentId1() {
        return studentId1;
    }


    public void setStudentId1(String studentId1) {
        this.studentId1 = studentId1;
    }


    //TODO: getters and setters


    public String getFirstName1() {
        return firstName1;
    }


    public void setFirstName1(String firstName1) {
        this.firstName1 = firstName1;
    }


    public String getLastName1() {
        return lastName1;
    }


    public void setLastName1(String  lastName1) {
        this.lastName1 = lastName1;
    }


    public int getAge1() {
        return age1;
    }


    public void setAge1(int age1) {
        this.age1 = age1;
    }


    public String getMajor1() {
        return major1;
    }


    public void setMajor1(String major1) {
        this.major1 = major1;
    }


    @Override
    public String toString() {
        //TODO
        return "Student ID: " + studentId1 + ", Name: " + firstName1 + " " +lastName1 + ", Age: " + age1 + ", Major: " + major1;

    }}






