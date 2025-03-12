public class Student extends Person {
    protected String myIdNum;    
    protected double myGPA;    

    // constructor
    public Student(String name, int age, String gender, String idNum, double gpa) {
        super(name, age, gender);  
        myIdNum = idNum;
        myGPA = gpa;
    }  

    //getter methods
    public String getIdNum(){
        return myIdNum;
    }

    public double getGPA(){
        return myGPA;
    }

    //setter methods
    public void setIdNum(String idNum) {
        myIdNum = idNum;
    }

    public void setGPA(double gpa) {
        myGPA = gpa;
    }

    @Override
    public String toString() {
        return super.toString() + ", ID: " + myIdNum + ", GPA: " + myGPA;
    }
}