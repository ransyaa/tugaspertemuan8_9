public class TestPerson {
    public static void main(String[] args) {
        Person person = new Person("Eka Nurul", "Bekasi", "089745364738", "ekanurul@gmail.com");
        Student student = new Student("Davina Nazwa", "Kuningan", "087763524356", "davinana@gmail.com", Student.SENIOR);
        MyDate hireDate = new MyDate(2024, 2, 10);
        Employee employee = new Employee("Citra Ayu", "Subang", "081762536478", "citraayu@gmail.com", "Office 101", 50000, hireDate);
        Faculty faculty = new Faculty("Satoru", "Bandung", "089546374687", "satotur@gmail.com", "Office 202", 75000, hireDate, 10, "Professor");
        Staff staff = new Staff("Kairi", "Jakarta", "089526488897", "satoru@gmail.com", "Office 303", 40000, hireDate, "Manager");

        System.out.println(person);
        System.out.println(student);
        System.out.println(employee);
        System.out.println(faculty);
        System.out.println(staff);
    }
}
