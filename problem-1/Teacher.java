public class Teacher extends Person {
    protected String mySubject;
    protected double mySalary;

    // constructor
    public Teacher(String name, int age, String gender, String subject, double salary) {
        super(name, age, gender);
        mySubject = subject;
        mySalary = salary;
    }

    // getters
    public String getSubject() {
        return mySubject;
    }

    public double getSalary() {
        return mySalary;
    }

    // setters
    public void setSubject(String subject) {
        mySubject = subject;
    }

    public void setSalary(double salary) {
        mySalary = salary;
    }

    // toString method
    @Override
    public String toString() {
        return super.toString() + ", subject: " + mySubject + ", salary: $" + mySalary;
    }
}
