public class TestClass {
    public static void main(String[] args) {
        // test person
        Person conor = new Person("Conor McGregor", 35, "M");
        System.out.println(conor);

        // test student
        Student izzy = new Student("Israel Adesanya", 34, "M", "MMA001", 3.8);
        System.out.println(izzy);

        // test teacher
        Teacher khabib = new Teacher("Khabib Nurmagomedov", 36, "M", "Wrestling", 65999);
        System.out.println(khabib);

        // test college student
        CollegeStudent jones = new CollegeStudent("Jon Jones", 36, "M", "MMA002", 3.9, 4, "Sports Science");
        System.out.println(jones);
    }
}


