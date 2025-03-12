public class CollegeStudent extends Student {
    protected String myMajor;
    protected int myYear;

    public CollegeStudent(String name, int age, String gender, String idNum, double gpa, int year, String major) {
        super(name, age, gender, idNum, gpa);
        myYear = year;
        myMajor = major;
    }

    // getters
    public String getMajor() {
        return myMajor;
    }

    public int getYear() {
        return myYear;
    }

    // setters
    public void setMajor(String major) {
        myMajor = major;
    }

    public void setYear(int year) {
        myYear = year;
    }

    // toString method
    @Override
    public String toString() {
        return super.toString() + ", Year: " + myYear + ", Major: " + myMajor;
    }
}
