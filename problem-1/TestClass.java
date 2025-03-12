public class TestClass {
    public static void main(String[] args) {
        // Tests the person
        Person conor = new Person("Conor McGregor", 35, "M");
        System.out.println(conor);

        // Test the student
        Student izzy = new Student("Israel Adesanya", 34, "M", "MMA001", 3.8);
        System.out.println(izzy);

        // Test the teacher with a fixed salary of 65,999
        Teacher khabib = new Teacher("Khabib Nurmagomedov", 36, "M", "Wrestling", 65999);
        System.out.println(khabib);

        // Test the college student
        CollegeStudent jones = new CollegeStudent("Jon Jones", 36, "M", "MMA002", 3.9, 4, "Sports Science");
        System.out.println(jones);
    }
}


