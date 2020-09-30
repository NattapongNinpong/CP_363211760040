package Lab7;

public class StudentApp {
    public static void main(String[] args) {
        //create object of Student class
        Student std1 = new Student();

        std1.setName("Nattapong");
        std1.setPerson_id("1111111111111");
        std1.setAge(21);

        displayDataOjaect(std1);

        Student std2 = new Student();
        std2.setName("Ninpong");
        std2.setPerson_id("222222222222");
        std2.setAge(21);

        displayDataOjaect(std2);

        std2.setName("Nin");

        Student std3 = new Student("Name","4444444444444",20);

        displayDataOjaect(std3);

        System.out.println(std3.toString());
    }

    private static void displayDataOjaect(Student std) {
        System.out.println(std.getName());
        System.out.println(std.getPerson_id());
        System.out.println(std.getAge());
    }
}
